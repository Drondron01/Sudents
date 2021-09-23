private static SessionFactory buildSessionFactory() {
        try {

        return new Configuration()
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("build SeesionFactory failed :" + ex);
            throw new ExceptionInInitializerError(ex);
        }
        }