-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 24-10-2022 a las 17:15:17
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_ferreteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `Id_Producto` int(11) NOT NULL AUTO_INCREMENT,
  `Cod_Producto` char(6) NOT NULL,
  `Nom_Producto` varchar(100) NOT NULL,
  `Cat_Producto` varchar(50) NOT NULL,
  `Mar_Producto` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Producto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE IF NOT EXISTS `proveedor` (
  `Id_Proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `Ruc_Proveedor` char(11) NOT NULL,
  `Nom_Proveedor` varchar(100) NOT NULL,
  `Con_Proveedor` varchar(100) NOT NULL,
  `Carg_Contacto` varchar(50) NOT NULL,
  `Tel_Contacto` char(9) NOT NULL,
  `Dir_Proveedor` varchar(150) NOT NULL,
  `Email_Proveedor` varchar(100) NOT NULL,
  `Tel_Proveedor` char(9) NOT NULL,
  PRIMARY KEY (`Id_Proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `Id_Stock` int(11) NOT NULL AUTO_INCREMENT,
  `Uni_Almacen` varchar(30) NOT NULL,
  `Can_Stock` int(5) NOT NULL,
  `Fech_Compra` date NOT NULL,
  `Pre_Compra` double(5,2) NOT NULL,
  `Pre_Venta` double(5,2) NOT NULL,
  `Id_Proveedor` int(11) NOT NULL,
  `Id_Producto` int(11) NOT NULL,
  PRIMARY KEY (`Id_Stock`),
  KEY `Id_Proveedor` (`Id_Proveedor`),
  KEY `Id_Producto` (`Id_Producto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `Id_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Dni_Usuario` char(8) NOT NULL,
  `Nom_Usuario` varchar(100) NOT NULL,
  `Tel_Usuario` char(9) NOT NULL,
  `Email_Usuario` varchar(150) NOT NULL,
  `Dir_Usuario` varchar(150) NOT NULL,
  `Tip_Usuario` char(13) NOT NULL,
  `User_Usuario` varchar(20) NOT NULL,
  `Pass_Usuario` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`Id_Producto`) REFERENCES `producto` (`Id_Producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`Id_Proveedor`) REFERENCES `proveedor` (`Id_Proveedor`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
