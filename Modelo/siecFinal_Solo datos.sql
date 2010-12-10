-- phpMyAdmin SQL Dump
-- version 3.3.7deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 10, 2010 at 06:40 PM
-- Server version: 5.1.49
-- PHP Version: 5.3.3-1ubuntu9.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `siec`
--

--
-- Dumping data for table `tc_carrera`
--

INSERT INTO `tc_carrera` (`CARRERA_ID`, `DES_CARRERA`) VALUES
(1, 'ISEI'),
(2, 'MECATRONICA'),
(3, 'ELECTRONICA'),
(4, 'ENERGIAS'),
(5, 'LANI'),
(6, 'INDUSTRIAL'),
(7, 'MECANICA');

--
-- Dumping data for table `tc_categorias`
--

INSERT INTO `tc_categorias` (`CATEGORIA_ID`, `DES_CATEGORIA`, `DESCRIPCION`, `ORDEN`) VALUES
(1, 'TEORIA', 'SE EVALUA LA PARTE TEORICA', 1),
(2, 'PRACTICA', 'SE EVALUA LA APLICACION DE LA TEORIA', 2);

--
-- Dumping data for table `tc_competencias`
--

INSERT INTO `tc_competencias` (`COMPETENCIA_ID`, `DES_COMPETENCIA`, `DESCRIPCION`, `CATEGORIA_ID`) VALUES
(1, 'PROGRAMACIO ESTRUCTURADA', 'EL ALUMNO APRENDERA A REALIZAR CODIGOS CON UNA ESTRUCTURA ORDENADA Y LIMPIA TAMBIEN', 2),
(2, 'MANEJO DE CISCO', 'EL ALIMNO APRENDERA A REALIZAR REDES EN LA HERRAMIENTA CISCO ', 2),
(3, 'APRENDER ESTRATEGIAS DE DOCUMENTACION', 'EL ALUMNO APRENDERA A REALIZAR LA DOCUMENTACION NECESARIA PARA EL DESARROLLO DEL SOFTWARE', 1),
(4, 'SOLUCION DE ECUACIONES', 'EL ALUMNO APRENDERA A RESOLVER ECUACIONES MEDIANTE DIFERENTES TIPOS DE SOLUCION', 2),
(5, 'ABC', 'Nueva competencia', 1);

--
-- Dumping data for table `tc_criterios`
--

INSERT INTO `tc_criterios` (`CRITERIO_ID`, `DES_CRITERIO`, `DESCRIPCION`, `Ponderacion`) VALUES
(1, 'REALIZAR METODS', 'EL ALUMNO APRENDERA A REALIZAR METODOS QUE PERMITAN COMPRENDER MAS UNCODIGO', 0),
(2, 'CREACION DE CLASES', 'EL ALUMNO APRENDERA A REALIZAR CLASESY METODOS BASICOS PARA EL DESARROLLO DE SOFTWARE', 0),
(3, 'PUNTUALIDAD', 'REALIZAR EN TIEMPO Y FORMA LAS ACTIVIDADES DE LA MATERIA', 0),
(4, 'REALIZAR VLANS', 'EL ALUMNO APRENDERA EL CONCEPTO Y ELABORACION DE VLANS', 0),
(5, 'ABC', 'Nuevo criterio', 12);

--
-- Dumping data for table `tc_departamentos`
--

INSERT INTO `tc_departamentos` (`DEPARTAMENTO_ID`, `DES_DEPARTAMENTO`) VALUES
(1, 'MATEMATICAS'),
(2, 'IDIOMAS'),
(3, 'ISEI');

--
-- Dumping data for table `tc_evaluacion_nivel`
--

INSERT INTO `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`, `DES_EVALUACION`) VALUES
(1, 'COMPETENTE'),
(2, 'BASICO'),
(3, 'INDEPENDIENTE'),
(4, 'AVANZADO'),
(5, 'INCOMPETENTE');

--
-- Dumping data for table `tc_grupo`
--

INSERT INTO `tc_grupo` (`GRUPO_ID`, `DES_GRUPO`, `CARRERA_ID`, `GRADO`) VALUES
(4, '6', 1, 'A'),
(5, '6', 1, 'A'),
(6, '4', 2, 'B'),
(7, '3', 6, '3');

--
-- Dumping data for table `tc_materias`
--

INSERT INTO `tc_materias` (`MATERIAS_ID`, `DES_MATERIAS`, `DEPARTAMENTO_ID`) VALUES
(1, 'PROGRAMACION II', 3),
(2, 'CALCULO INTEGRAL', 1),
(3, 'INGLES VI', 2);

--
-- Dumping data for table `tc_perfil`
--

INSERT INTO `tc_perfil` (`PERFIL_ID`, `DES_PERFIL`) VALUES
(1, 'alumno'),
(2, 'maestro'),
(3, 'tutor'),
(4, 'DPA'),
(5, 'jefe de carrera');

--
-- Dumping data for table `tc_reportes`
--

INSERT INTO `tc_reportes` (`REPORTES_ID`, `DES_REPORTES`, `PERFIL_ID`) VALUES
(1, 'semanal', 1),
(2, 'informal', 2),
(3, 'informal', 3),
(4, 'parcial', 4);

--
-- Dumping data for table `tc_tipo_evaluacion`
--

INSERT INTO `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`, `DES_TIPO_EVALUACION`) VALUES
(1, 'FORMATIVA'),
(2, 'ACUMULATIVA'),
(3, 'PARCIAL');

--
-- Dumping data for table `tr_alumnos`
--

INSERT INTO `tr_alumnos` (`ALUMNOS_ID`, `MATRICULA`, `USUARIO_ID`, `CARRERA_ID`) VALUES
(11, 'up080394', 7, 1),
(12, 'up080293', 8, 2);

--
-- Dumping data for table `tr_criterio_competencia`
--

INSERT INTO `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`, `PONDERACION_CRITERIO`, `CRITERIO_ID`, `COMPETENCIA_ID`) VALUES
(2, '9', 1, 1),
(3, '10', 2, 2),
(4, '9', 3, 3),
(5, '8', 4, 4),
(6, NULL, 5, 5),
(7, NULL, 4, 5),
(8, NULL, 1, 5);

--
-- Dumping data for table `tr_estrategias`
--

INSERT INTO `tr_estrategias` (`ESTRATEGIA_ID`, `FECHA_INICIO_REGISTRO`, `MENSAJE`, `FECHA_CAMBIO`) VALUES
(16, '10-01-2010', 'Estudiar mas', '10-02-2010');

--
-- Dumping data for table `tr_estra_mgm`
--


--
-- Dumping data for table `tr_est_alumno`
--


--
-- Dumping data for table `tr_evaluacion_acumulativa`
--

INSERT INTO `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`, `PARCIAL`, `CALIFICACION`) VALUES
(1, 1, 9),
(2, 2, 10),
(3, 3, 8),
(4, 2, 7);

--
-- Dumping data for table `tr_evaluacion_parcial`
--

INSERT INTO `tr_evaluacion_parcial` (`EVALUACION_PARCIAL_ID`, `CALIFICACION`, `PARCIAL`, `EVALUACION_NIVEL_ID`, `TIPO_EVALUACION_ID`, `ALUMNOS_ID`, `sesion_id`) VALUES
(12, 0, 1, 2, 1, 11, 5),
(20, 0, 1, 3, 2, 12, 5),
(21, 0, 1, 4, 3, 11, 5),
(22, 0, 1, 4, 3, 12, 5);

--
-- Dumping data for table `tr_evaluacion_parcial_acumulativa`
--

INSERT INTO `tr_evaluacion_parcial_acumulativa` (`EVALUACION_PARCIAL_ACUMULATIVA_ID`, `EVALUACION_PARCIAL_ID`, `EVALUACION_ACUMULATIVA_ID`) VALUES
(14, 12, 1);

--
-- Dumping data for table `tr_grupo_alumno`
--

INSERT INTO `tr_grupo_alumno` (`GRUPO_ALUMNO_ID`, `GRUPO_ID`, `ALUMNOS_ID`) VALUES
(2, 4, 11),
(3, 4, 12);

--
-- Dumping data for table `tr_grupo_carrera`
--

INSERT INTO `tr_grupo_carrera` (`GRUPO_CARRERA_ID`, `CARRERA_ID`, `GRUPO_ID`) VALUES
(1, 1, 4),
(2, 2, 5),
(3, 3, 5),
(4, 6, 6),
(5, 4, 5),
(6, 5, 7),
(7, 1, 4);

--
-- Dumping data for table `tr_maestros`
--

INSERT INTO `tr_maestros` (`MAESTRO_ID`, `CODIGO`, `USUARIO_ID`) VALUES
(6, 'adsjkh', 9);

--
-- Dumping data for table `tr_maestro_grupo_materia`
--

INSERT INTO `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`, `GRUPO_ID`, `MATERIAS_ID`, `MAESTRO_ID`) VALUES
(9, 4, 1, 6);

--
-- Dumping data for table `tr_materia_maestro_grupo_alumno`
--


--
-- Dumping data for table `tr_presesion`
--

INSERT INTO `tr_presesion` (`PRESESION_ID`, `MENSAJE`, `ESTADO`, `PONDERACION`, `CRITERIO_COMPETENCIA_ID`) VALUES
(6, 'Mensaje de la presesion 1', 0, '80', 2),
(7, 'Mensaje de la presesion 2 ', 1, '70', 3),
(8, 'Mensaje de la presesion 3', 1, '60', 4),
(9, 'Mensaje de la presesion 4', 0, '50', 5);

--
-- Dumping data for table `tr_presesion_rechazada`
--

INSERT INTO `tr_presesion_rechazada` (`SESION_RECHAZADA_ID`, `MENSAJE`, `PRESESION_ID`) VALUES
(5, 'Fallida por falta de criterios', 6);

--
-- Dumping data for table `tr_sesion`
--

INSERT INTO `tr_sesion` (`sesion_id`, `MATERIA_GRUPO_MAESTRO_ID`, `PRESESION_ID`, `ESTADO`) VALUES
(5, 9, 6, 1);

--
-- Dumping data for table `tr_usuario`
--

INSERT INTO `tr_usuario` (`USUARIO_ID`, `NOMBRES`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `FECHA_NAC`, `USUARIO`, `PASSWORD`, `IMAGEN`, `PERFIL_ID`) VALUES
(7, 'carlos', 'bolanos', 'lopez', '2010-10-10', 'garrison', 'gameover', 'asd', 1),
(8, 'victor', 'valenzuela', 'martinez', '2001-01-02', 'sanders', 'sands', 'asd', 2),
(9, 'Maria', 'Teran', 'algo', '2003-04-02', 'rteran', 'r', 'asd', 3);
