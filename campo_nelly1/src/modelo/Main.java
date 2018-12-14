/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.hibernate.Session;
import vistas.Ventana;

/**
 *
 * @author salazarwalter
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Campo campo=new Campo();
//       campo.setEstadocampo("Creado");
//       campo.setNombrecampo("Campo 4");
//       campo.setSuperficiecampo(2500);
////       campo.setIdcampo(1);
//       Lote l1=new Lote();
//       l1.setCampo(campo);
//       l1.setNumerolote(125);
//       l1.setSuperficielote(500);
//       l1.setTiposuelo("II");
//       
//       Lote l2=new Lote();
//       l2.setCampo(campo);
//       l2.setNumerolote(126);
//       l2.setSuperficielote(1000);
//       l2.setTiposuelo("IV");
//       
//       Lote l3=new Lote();
//       l3.setCampo(campo);
//       l3.setNumerolote(127);
//       l3.setSuperficielote(1000);
//       l3.setTiposuelo("I");
//       campo.getLotes().add(l1);
//       campo.getLotes().add(l2);
//       campo.getLotes().add(l3);
//       
//       try {
//        Session session = HibernateUtil.  getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//           System.out.println(campo);
//        session.persist(campo);
//        session.getTransaction().commit();
//           System.out.println(campo);
//        //session.close(); 
//        System.exit(0);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    
    new Ventana().setVisible(true);
    }
    
}
