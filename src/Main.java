import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: a1
 * Date: 14.06.12
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Predpr predpr = new Predpr();
       // predpr.setIdPredpr(null);
       // predpr.setPredpr("ОАО ММК");
        //predpr = (Predpr) session.get(Predpr.class, predpr.getPredpr());
        System.out.println(predpr);
        //session.save(predpr);

        session.flush();
        session.close();
    }
}
