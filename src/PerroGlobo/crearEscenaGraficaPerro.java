/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerroGlobo;

import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

/**
 *
 * @author DE LA CRUZ VILLANUEV
 */
class crearEscenaGraficaPerro {
    
    BranchGroup objRaiz = new BranchGroup();
    
    public crearEscenaGraficaPerro(){
        
        capsula panza = new capsula(1,1);
        capsula cabeza = new capsula(0.4f,0.27f);
        capsula cola1 = new capsula(0.3f,0.15f);
        capsula cola2 = new capsula(0.1f,0.3f);
        
        objRaiz.addChild(panza.tgCapsula);
        objRaiz.addChild(cabeza.tgCapsula);
        panza.tgCapsula.addChild(cola1.tgCapsula);
        cola1.tgCapsula.addChild(cola2.tgCapsula);
        //<------CABEZA----->
        Transform3D t3dGirarCabeza = new Transform3D();
        Transform3D t3dMoverCabeza = new Transform3D();
        t3dMoverCabeza.setTranslation(new Vector3f(0.38f,0.34f,0.0f));
        t3dGirarCabeza.rotZ(Math.PI/180*-25);
        t3dMoverCabeza.mul(t3dGirarCabeza);
        cabeza.tgCapsula.setTransform(t3dMoverCabeza);
        //<----FIN CABEZA---->
        
        //<-----BASE COLA---->
        Transform3D t3dGirarColita1 = new Transform3D();
        Transform3D t3dMoverColita1 = new Transform3D();
        t3dMoverColita1.setTranslation(new Vector3f(0.25f,0.45f,0.0f));
        t3dGirarColita1.rotZ(Math.PI/180*-60);
        t3dMoverColita1.mul(t3dGirarColita1);
        cola1.tgCapsula.setTransform(t3dMoverColita1);
        //<------FIN BASE COLA------->
        
        //<------FINAL COLA-------->
        Transform3D t3dGirarColita2 = new Transform3D();
        Transform3D t3dMoverColita2 = new Transform3D();
        t3dMoverColita2.setTranslation(new Vector3f(0.0f,0.2f,0.0f));
        t3dGirarColita2.rotZ(Math.PI/180);
        t3dMoverColita2.mul(t3dGirarColita2);
        cola2.tgCapsula.setTransform(t3dMoverColita2);
        //<------ FIN FINAL COLA-------->
        
        //solo es para probar que si funcione el pull 
        
    }
    
}
