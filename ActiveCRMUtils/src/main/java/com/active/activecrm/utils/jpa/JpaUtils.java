package com.active.activecrm.utils.jpa;

import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.collection.internal.PersistentSet;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class JpaUtils
{

    private IdentityHashMap objects = new IdentityHashMap();



    public Object cloneObjectAndDetach( Object obj ) throws IllegalAccessException, InstantiationException
    {
        Object clone;
        if( obj == null )
        {
            return null;
        }

        if( objects.containsKey( obj ) )
        {
            return objects.get( obj );
        }
        if ( obj.getClass().isEnum() )
        {
            clone = obj;
            objects.put( obj, clone );
        }
        else if ( obj.getClass().equals( PersistentBag.class ) )
        {
            if( ( ( PersistentBag )obj ).wasInitialized() )
            {
                clone = new ArrayList<>();
                objects.put( obj, clone );
                for ( Object child : ( PersistentBag ) obj )
                {
                    ( (ArrayList)clone ).add( cloneObjectAndDetach( child ) );
                }
            }
            else
            {
                return null;
            }
        }
        else if( obj.getClass().equals( PersistentSet.class ) )
        {
            if( ( ( PersistentSet )obj ).wasInitialized() )
            {
                clone = new HashSet<>();
                objects.put( obj, clone );
                for ( Object child : ( ( PersistentSet ) obj ) )
                {
                    ( ( HashSet )clone ).add( cloneObjectAndDetach( child ) );
                }
            }
            else
            {
                return null;
            }
        }
        else if( obj.getClass().equals( HashMap.class ) )
        {
            clone = new HashMap<>();
            objects.put( obj, clone );
            for ( Object key : ( ( HashMap )obj ).keySet() )
            {
                ( ( HashMap )clone ).put( cloneObjectAndDetach( key ), cloneObjectAndDetach( ( ( HashMap )obj ).get( key ) ) );
            }
        }
        else if( obj.getClass().equals( ArrayList.class ) )
        {
            clone = new ArrayList<>();
            objects.put( obj, clone );
            for ( Object child : ( ArrayList ) obj )
            {
                ( (ArrayList)clone ).add( cloneObjectAndDetach( child ) );
            }
        }
        else
        {
            clone = obj.getClass().newInstance();
            objects.put( obj, clone );
            for ( Field field : obj.getClass().getDeclaredFields() )
            {
                field.setAccessible( true );
                if ( field.get( obj ) == null || Modifier.isFinal( field.getModifiers() ) )
                {
                    continue;
                }
                if ( field.getType().isPrimitive() || field.getType().equals( String.class )
                        || ( field.getType().getSuperclass() != null && field.getType().getSuperclass().equals( Number.class ) )
                        || field.getType().equals( Boolean.class ) )
                {
                    field.set( clone, field.get( obj ) );
                }
                else
                {
                    Object childObj = field.get( obj );
                    if ( childObj == obj )
                    {
                        field.set( clone, clone );
                    }
                    else
                    {
                        if( objects.containsKey( field.get( obj ) ) )
                        {
                            field.set( clone, objects.get( field.get( obj ) ) );
                        }
                        else
                        {
                            field.set( clone, cloneObjectAndDetach( field.get( obj ) ) );
                        }
                    }
                }
            }
        }
        return clone;
    }
}
