package class25_reflex.classknowledge.singletonmode;
//µ¥ÀýÄ£Ê½
public class Session {

    private static Session session=null;

    private Session() {
    }

    public synchronized static Session get(){
        if(session==null){
            session= new Session();
        }
        return session;
    }
}
