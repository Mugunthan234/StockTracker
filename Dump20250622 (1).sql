CREATE DATABASE  IF NOT EXISTS `stocktracker` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `stocktracker`;
-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: stocktracker
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stockdetails`
--

DROP TABLE IF EXISTS `stockdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stockdetails` (
  `Sno` int DEFAULT NULL,
  `Stock_Name` varchar(50) DEFAULT NULL,
  `Stock_Price` float DEFAULT NULL,
  `Stock_BuyPrice` float DEFAULT NULL,
  `Stock_BuyDate` date DEFAULT NULL,
  `Stock_BuyCount` float DEFAULT NULL,
  `Broker_Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stockdetails`
--

LOCK TABLES `stockdetails` WRITE;
/*!40000 ALTER TABLE `stockdetails` DISABLE KEYS */;
INSERT INTO `stockdetails` VALUES (1,'Aura Gold',9503.26,544.66,'2025-05-18',0.0571,'Aura Gold'),(2,'Aura Silver',108.96,108.96,'2025-05-18',1,'Aura Gold'),(3,'Gold Bees',80.69,484,'2025-05-18',6,'Angel One'),(4,'Kotak Equity Arbitrage Fund',100,100,'2025-05-20',1,'Angel One'),(5,'HDFC Mid Cap Opportunities Fund',100,100,'2025-05-22',1,'Angel One'),(6,'Gold Bees',79.5,80.45,'2025-05-29',1,'Angel One'),(7,'Aura Gold',9503.26,50,'2025-05-29',0.052,'Aura Gold'),(8,'ITC',417,417,'2025-05-29',1,'Angle One'),(9,'Tata Motors',713.6,713.6,'2025-06-05',1,'Angle One'),(10,'Gold Bees',81.39,81.39,'2025-06-05',1,'Angle One'),(11,'ITC',415.5,415.5,'2025-06-16',1,'Angle One'),(12,'Tata Motors',680.1,680.1,'2025-06-17',1,'Angle One'),(13,'ITC',417.15,417.15,'2025-06-17',1,'Angle One'),(14,'Aura Silver',118.45,118.45,'2025-06-17',1,'Aura Gold'),(15,'HDFC Mid Cap Opportunities Fund',100,200,'2025-06-17',2,'Angel One');
/*!40000 ALTER TABLE `stockdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-22 13:29:19
