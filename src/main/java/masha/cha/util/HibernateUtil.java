package masha.cha.util;

import masha.cha.pojos.Person;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory;


    private HibernateUtil() {
    }

    public static void getSessionFactory() {
//        if (sessionFactory != null) {
//            return sessionFactory;
//        }
//
//        try {
//            Configuration configuration =
//                    new Configuration().addAnnotatedClass(Person.class)
//                    .configure();
//            StandardServiceRegistryBuilder builder =
//                    new StandardServiceRegistryBuilder()
//                            .applySettings(configuration.getProperties());
//                sessionFactory =
//                        configuration.buildSessionFactory(builder.build());
//        } catch (Exception e) {
//            System.out.println("Exception!" + e);
//        }

//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();
//        try {
//            sessionFactory =
//                    new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//
//        }
//        return sessionFactory;
//    }


    }}



