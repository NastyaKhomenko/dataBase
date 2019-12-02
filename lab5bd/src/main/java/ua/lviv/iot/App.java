package ua.lviv.iot;

import ua.lviv.iot.dao.implementation.Sessions;
import org.hibernate.Session;
import ua.lviv.iot.view.implementation.MyView;

    public class App {

        public static void main(String[] args) {
            Sessions sessions =new Sessions();
            Session session = sessions.openCurrentSessionWithTransaction();
            new MyView(session).show();
            sessions.closeCurrentSessionWithTransaction();
        }
    }


