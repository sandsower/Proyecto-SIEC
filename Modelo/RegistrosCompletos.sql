/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.1.35-community : Database - siec
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`siec` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `siec`;

/*Data for the table `tc_carrera` */

insert  into `tc_carrera`(`CARRERA_ID`,`DES_CARRERA`) values (1,'ISEI'),(2,'MECATRONICA'),(3,'ELECTRONICA'),(4,'ENERGIAS'),(5,'LANI'),(6,'INDUSTRIAL'),(7,'MECANICA');

/*Data for the table `tc_categorias` */

insert  into `tc_categorias`(`CATEGORIA_ID`,`DES_CATEGORIA`,`DESCRIPCION`,`ORDEN`) values (1,'TEORIA','SE EVALUA LA PARTE TEORICA',1),(2,'PRACTICA','SE EVALUA LA APLICACION DE LA TEORIA',2);

/*Data for the table `tc_competencias` */

insert  into `tc_competencias`(`COMPETENCIA_ID`,`DES_COMPETENCIA`,`DESCRIPCION`,`CATEGORIA_ID`) values (1,'PROGRAMACIO ESTRUCTURADA','EL ALUMNO APRENDERA A REALIZAR CODIGOS CON UNA ESTRUCTURA ORDENADA Y LIMPIA',2),(2,'MANEJO DE CISCO','EL ALIMNO APRENDERA A REALIZAR REDES EN LA HERRAMIENTA CISCO ',2),(3,'APRENDER ESTRATEGIAS DE DOCUMENTACION','EL ALUMNO APRENDERA A REALIZAR LA DOCUMENTACION NECESARIA PARA EL DESARROLLO DEL SOFTWARE',1),(4,'SOLUCION DE ECUACIONES','EL ALUMNO APRENDERA A RESOLVER ECUACIONES MEDIANTE DIFERENTES TIPOS DE SOLUCION',2);

/*Data for the table `tc_criterios` */

insert  into `tc_criterios`(`CRITERIO_ID`,`DES_CRITERIO`,`DESCRIPCION`) values (1,'REALIZAR METODS','EL ALUMNO APRENDERA A REALIZAR METODOS QUE PERMITAN COMPRENDER MAS UNCODIGO'),(2,'CREACION DE CLASES','EL ALUMNO APRENDERA A REALIZAR CLASESY METODOS BASICOS PARA EL DESARROLLO DE SOFTWARE'),(3,'PUNTUALIDAD','REALIZAR EN TIEMPO Y FORMA LAS ACTIVIDADES DE LA MATERIA'),(4,'REALIZAR VLANS','EL ALUMNO APRENDERA EL CONCEPTO Y ELABORACION DE VLANS'),(5,'REALIZAR IPS','EL ALUMNO APRENDERA A OBTENER IPS Y LOS DIFERENTES TIPOS'),(6,'REALIZAR CASOS DE USO','EL ALUMNO APRENDERA A REALIZAR CASOS DE USOPARA TENER UNA MEJOR PANORAMICA DE COMO SE REALIZA UN SOFTWARE Y CURSO QUE TOMA'),(7,'USO DE HERRAMIENTAS CASE','EL ALUMNO APRENDERA A UTILIZAR HERRAMINETAS UTILES PARA LA ELABORACION DE LA DOCUMENTACION DEL SOFTWARE'),(8,'ECUACIONES DE PRIMER GRADO','EL ALUMNO APRENDERA A RESOLVER ESTE TIPO DE ECUACIONES APLICANDO EL PROCEDIMIENTO ADECUADO');

/*Data for the table `tc_departamentos` */

insert  into `tc_departamentos`(`DEPARTAMENTO_ID`,`DES_DEPARTAMENTO`) values (1,'MATEMATICAS'),(2,'IDIOMAS'),(3,'ISEI');

/*Data for the table `tc_evaluacion_nivel` */

insert  into `tc_evaluacion_nivel`(`EVALUACION_NIVEL_ID`,`DES_EVALUACION`) values (1,'COMPETENTE'),(2,'BASICO'),(3,'INDEPENDIENTE'),(4,'AVANZADO'),(5,'INCOMPETENTE');

/*Data for the table `tc_grupo` */

insert  into `tc_grupo`(`GRUPO_ID`,`DES_GRUPO`,`CARRERA_ID`,`CUATRIMESTRE`,`LETRA`) values (1,'ISEI_6A_2010',1,'6','A'),(2,'INDUSTRILA_1B_2010',6,'1','B'),(3,'ISEI_3A_2010',1,'3','A');

/*Data for the table `tc_materias` */

insert  into `tc_materias`(`MATERIAS_ID`,`DES_MATERIAS`,`DEPARTAMENTO_ID`) values (1,'PROGRAMACION II',3),(2,'CALCULO INTEGRAL',1),(3,'INGLES VI',2);

/*Data for the table `tc_perfil` */

insert  into `tc_perfil`(`PERFIL_ID`,`DES_PERFIL`) values (1,'alumno'),(2,'maestro'),(3,'tutor'),(4,'DPA'),(5,'jefe de carrera');

/*Data for the table `tc_reportes` */

insert  into `tc_reportes`(`REPORTES_ID`,`DES_REPORTES`,`PERFIL_ID`) values (1,'semanal',1),(2,'informal',2),(3,'informal',3),(4,'parcial',4);

/*Data for the table `tc_tipo_evaluacion` */

insert  into `tc_tipo_evaluacion`(`TIPO_EVALUACION_ID`,`DES_TIPO_EVALUACION`) values (1,'FORMATIVA'),(2,'ACUMULATIVA'),(3,'PARCIAL');

/*Data for the table `tr_alumnos` */

insert  into `tr_alumnos`(`ALUMNOS_ID`,`MATRICULA`,`USUARIO_ID`,`GRUPO_ID`,`CARRERA_ID`) values (2,'UP080605',2,2,2),(3,'UP080704',3,3,3),(6,'UP010101',4,1,2),(9,'UP999999',2,2,3);

/*Data for the table `tr_comentario_dpa_estrategia` */

insert  into `tr_comentario_dpa_estrategia`(`COMENT_ESTRA_DPA_ID`,`ESTRATEGIA_ID`) values (1,12),(2,13),(4,14),(5,15);

/*Data for the table `tr_criterio_competencia` */

insert  into `tr_criterio_competencia`(`CRITERIO_COMPETENCIA_ID`,`PONDERACION_CRITERIO`,`CRITERIO_ID`,`COMPETENCIA_ID`) values (2,'9',1,1),(3,'10',2,2),(4,'9',3,3),(5,'8',4,4);

/*Data for the table `tr_estrategias` */

insert  into `tr_estrategias`(`ESTRATEGIA_ID`,`FECHA_INICIO_REGISTRO`,`MENSAJE`,`MAESTROS_MAESTRO_ID`) values (12,'2010-10-10','exitoso',1),(13,'2010-09-09','esfuerzate',2),(14,'2010-11-11','tu puedes',1),(15,'2011-01-01','mediocre',3);

/*Data for the table `tr_evaluacion_acumulativa` */

insert  into `tr_evaluacion_acumulativa`(`EVALUACION_ACUMULATIVA_ID`,`PARCIAL`,`CALIFICACION`) values (1,1,9),(2,2,10),(3,3,8),(4,2,7);

/*Data for the table `tr_evaluacion_parcial` */

insert  into `tr_evaluacion_parcial`(`EVALUACION_PARCIAL_ID`,`CALIFICACION`,`PARCIAL`,`EVALUACION_NIVEL_ID`,`TIPO_EVALUACION_ID`,`MAESTRO_MATERIA_GRUPO_SESION_ID`,`ALUMNOS_ID`) values (2,9,9,1,1,1,2),(3,10,2,2,2,2,3),(7,8,2,3,3,3,2),(9,7,3,2,2,4,6);

/*Data for the table `tr_evaluacion_parcial_acumulativa` */

insert  into `tr_evaluacion_parcial_acumulativa`(`EVALUACION_PARCIAL_ACUMULATIVA_ID`,`EVALUACION_PARCIAL_ID`,`EVALUACION_ACUMULATIVA_ID`) values (2,2,2),(3,3,3),(11,7,2),(13,9,4);

/*Data for the table `tr_maestro_materia` */

insert  into `tr_maestro_materia`(`MAESTRO_MATERIA_ID`,`MATERIAS_ID`,`MAESTRO_ID`) values (1,2,2),(2,1,1),(3,3,3),(7,3,3);

/*Data for the table `tr_maestro_materia_grupo` */

insert  into `tr_maestro_materia_grupo`(`MAESTRO_MATERIA_GRUPO_ID`,`GRUPO_GRUPO_ID`,`MAESTRO_MATERIA_ID`) values (1,1,1),(2,2,2),(3,3,3),(4,2,7);

/*Data for the table `tr_maestro_materia_grupo_sesion` */

insert  into `tr_maestro_materia_grupo_sesion`(`MAESTRO_MATERIA_GRUPO_SESION_ID`,`SESION_SESION_ID`,`MAE_MAT_GRP_ID`) values (1,1,1),(2,2,2),(3,3,3),(4,4,4);

/*Data for the table `tr_maestros` */

insert  into `tr_maestros`(`MAESTRO_ID`,`CODIGO`,`USUARIO_ID`) values (1,'Progra',3),(2,'Admin',6),(3,'Desarrollo',6),(4,'ingles',6);

/*Data for the table `tr_sesion` */

insert  into `tr_sesion`(`SESION_ID`,`MENSAJE`,`ESTADO`,`CRITERIO_COMPETENCIA_CRITERIO_COMPETENCIA_ID`,`SESION_RECHAZADA_SESION_RECHAZADA_ID`,`PONDERACION`) values (1,'tiene nuevo mensaje',0,2,2,'total'),(2,'no ha recibido evaluacion',0,1,1,'total'),(3,'ha ocurrido error',0,3,3,'total'),(4,'registrese aqui',0,2,2,'nula');

/*Data for the table `tr_sesion_rechazada` */

insert  into `tr_sesion_rechazada`(`SESION_RECHAZADA_ID`,`MENSAJE`) values (1,'Error en servidor'),(2,'Clave o nombre de usuario incorrecto'),(3,'Excediste limite de tiempo de sesión inactiva'),(4,'Ya has iniciado sesión en otra IP');

/*Data for the table `tr_usuario` */

insert  into `tr_usuario`(`USUARIO_ID`,`NOMBRES`,`APELLIDOS`,`FECHA_NAC`,`USUARIO`,`PASSWORD`,`PERFIL_ID`) values (2,'Pedro Miguel','Hdz Jasso','0000-00-00','viruskimera','*****',1),(3,'Maria del Rocio','Teran Reyes','0000-00-00','RteranR','*****',2),(4,'Giannina','Cajero Rodgz','2010-09-27','giannina','***',1),(5,'Amanda',NULL,'2010-09-09','amanda','***',1),(6,'Omar','Rosales','2010-10-10','Omar','***',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
