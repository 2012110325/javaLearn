package com.other;

import com.soundsystem.CDPlayer;
import com.spittr.web.HomeController;
import org.apache.commons.math3.util.FastMath;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by liqiang28 on 2018/1/29.
 */
public class firstServlet extends HttpServlet {

    private static final int MILLISECONDS_IN_ONE_DAY = 24 * 3600 * 1000;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test Here");
        resp.getOutputStream().println("adf");
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());

        ctx.getBean(CDPlayer.class).play();
        System.out.println(ctx.getBean(HomeController.class).home());

        System.out.println(ctx.getBean(DefaultAnnotationHandlerMapping.class));
        System.out.println(ctx.getBean(InternalResourceViewResolver.class));

    }


    public static void main (String[] args) {

//        DateTime dateTime=DateTime.now();
//        String format="yyyy-MM-dd HH:m";
//        System.out.println(dateTime.toString(format));
//        int i = 20180901;
//        DateTime b = new DateTime("2018:09:01");
//        System.out.println( b);
//      LocalTime localTime=dateTime.toLocalTime();
//      System.out.println(localTime.toString(format));

//        List<String> l = new ArrayList<String>();
////        l.addAll(null);
//        System.out.println(l.size());
//        l.addAll(new ArrayList<String>(0));
//        System.out.println(l.size());

//        List<String> b = new ArrayList<String>();
//        List<String> c = new ArrayList<String>();
//        b.add("a");
//        b.add("shenchen");
//        b.add("shenchen");
//        b.add("shenc");
//        b.add("shenchen");
//
//        f(b, c);
//        System.out.println(c);
//        System.out.println(b);

//
//        DateTime d = new DateTime();
//        System.out.println(d);
//
//        System.out.println(d.hourOfDay().roundCeilingCopy());

        String a = "abc";
        String b = "cdf";

//        if (a.comb) {
//
//        }


        Map<String, String> m = new HashMap<String, String>();
        m.put("a", "b");

        System.out.println(m.values().iterator().next());
    }


    static void f(List<String> a, List<String> b) {


//        for (Iterator<String> ite = a.iterator(); ite.hasNext(); ) {
//            String s = ite.next();
//
//            if (s.equals("shenchen")) {
//                ite.remove();
//            }
////        }
//        b.addAll(a);
//        a.clear();
//       b.remove()




    }



    public static int calcNumOfDaysBetweenTwoDates(DateTime checkInTime, DateTime checkOutTime) {
        DateTime truncatedCheckInTime = checkInTime.dayOfMonth().roundFloorCopy();
        DateTime truncatedCheckOutTime = checkOutTime.dayOfMonth().roundFloorCopy();
        return FastMath.toIntExact(Math.abs(truncatedCheckOutTime.getMillis() - truncatedCheckInTime.getMillis()) / MILLISECONDS_IN_ONE_DAY);
    }

}
