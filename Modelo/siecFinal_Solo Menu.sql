/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.1.52-community : Database - siec
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

USE `siec`;

/*Data for the table `tl_menu` */

insert  into `tl_menu`(`id_menu`,`menu`,`url`,`img`,`tc_perfil_PERFIL_ID`) values (1,'Competencias','Competencias/Asignar/grupos.jsp','competencias',1),(2,'Reportes','reportes.jsp','reportes',1),(3,'Coevaluaciones','Evaluaciones/Coevaluacion/BienvenidoCE.jsp','formativas',2),(5,'Estrategias','estrategias/','estrategias',1),(6,'Auto-Evaluacion','Evaluaciones/Autoevaluacion/BienvenidoAE.jsp','autoevaluacion',2),(7,'Evaluaciones Formativas','Evaluaciones/EvaluacionF/BienvenidoEF.jsp','formativas',1),(8,'Competencias','competencias.jsp','competencias',3),(9,'Revisiones','revisiones.jsp','revisiones',3),(10,'Criterios','criterios.jsp','criterios',3),(11,'Reportes','reportes.jsp','reportes',3),(12,'Estrategias','evaluaciones.jsp','estrategias',3),(13,'Competencias','competencias/obtenerCompetencias','competencias',4),(14,'Criterios','criterios.jsp','criterios',4),(15,'Reportes','reportes.jsp','reportes',4),(16,'Estrategias','evaluaciones.jsp','estrategias',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
