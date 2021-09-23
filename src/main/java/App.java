public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = new Student();
        student.setFirstName("Sergey");
        student.setLastName("Sergeev");
        student.setContactNo("+7-915-638-1317");
        session.save(student);
        session.getTransaction().commit();
        Query<Student> q = session.createQuery("From Student", Student.class);
        List<Student> resultList = q.list();
        System.out.println("total sudents:" + resultList.size());

        for (Student s : resultList) {
            System.out.println("student : " + s);
        }
    }
}