package com.study.springboot;

import jakarta.persistence.*;

public class JpaBasic {
    public static void main(String[] args) {
        System.out.println("jpa-basic");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-basic");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            // 실제 메소드 들어가는 곳
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("Kim");
//            em.persist(member);


//            Member member1 = em.find(Member.class, 1L); //DB에서 조회
//            Member member2 = em.find(Member.class, 1L); //1차 캐시에서 가져옴 (쿼리X)
//            System.out.println("member1 = " + member1);
//            System.out.println("member2 = " + member2);

            // 쓰기 지연
//            Member member1 = new Member();
//            member1.setId(1L);
//            member1.setName("Kim");
//
//            Member member2 = new Member();
//            member2.setId(2L);
//            member2.setName("Lee");
//
//            em.persist(member1);
//            em.persist(member2);
//
//            System.out.println("===> INSERT 쿼리는 아직 실행되지 않았음!");
//
//            // 쓰기 지연된 쿼리를 강제로 실행
//            em.flush();
//            System.out.println("===> flush() 호출 후 INSERT 쿼리 실행됨");

            //update
//            Member member = em.find(Member.class,1L);
//            member.setName("Lee");// 변경 감지 update

            //delete
//            Member member = em.find(Member.class,1L);
//            em.remove(member); //커밋 시 delete 실행

            //merge
            Member detachedMember = new Member();
            detachedMember.setId(2L);
            detachedMember.setName("Merged");

            Member managed = em.merge(detachedMember);

            tx.commit(); //flush(),commit()
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
            emf.close();
        }
    }
}
