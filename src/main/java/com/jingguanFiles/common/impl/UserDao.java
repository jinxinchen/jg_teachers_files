//package com.jingguanFiles.common.impl;
//
//import com.jingguanFiles.common.po.TTeacherBaseinfoEntity;
//import com.jingguanFiles.manageTeachers.po.TUsersEntity;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;
//
//import java.util.List;
//
///**
// * Created by 陈 on 2017/12/13.
// */
//public class UserDao extends BaseDao{
//
//    public Integer findUserIdByUserAccount(String account){
//        Session session = getCurrentSession();
//        Transaction transaction = session.beginTransaction();
//
//        List<TUsersEntity> user =  session.createCriteria(TUsersEntity.class).add(Restrictions.eq("account",account)).list();
//        if(user.size() == 0){
//            System.out.println(1);
//            return null;
//        }else{
//            System.out.println(2);
//            return user.get(0).getId();
//        }
//
//    }
//
//    //根据教师姓名查找user_id
//    public  Integer findUserIdByTname(String teacherName){
//        Session session = getCurrentSession();
//        Transaction transaction = session.beginTransaction();
//
//        List<TTeacherBaseinfoEntity> res = session.createCriteria(TTeacherBaseinfoEntity.class).add(Restrictions.eq("name",teacherName)).list();
//        if(res.size() == 0){
//            System.out.println(1);
//            return  null;
//        }else{
//            System.out.println(2);
//            return res.get(0).getUserId();
//        }
//    }
//}
