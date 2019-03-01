-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: pedidos
-- ------------------------------------------------------
-- Server version	8.0.13-commercial

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_pagamento`
--

DROP TABLE IF EXISTS `item_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `item_pagamento` (
  `id` bigint(20) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `id_menu` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrosgcry9ypofbpdyjda32jf87` (`id_menu`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_pagamento`
--

LOCK TABLES `item_pagamento` WRITE;
/*!40000 ALTER TABLE `item_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `preco` double NOT NULL,
  `id_restaurante` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7h5i5dcg9v85hbknmvfs22txe` (`id_restaurante`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'Cup Cake recheado de Doce de Leite','assets/img/foods/cupcake.png','Cup Cake',8.7,1),(2,'Coberto com chantilly','assets/img/foods/donut.png','Donut',2.5,1),(3,'Pão artesanal com queijos italianos','assets/img/foods/bread.png','Pão Artesanal Italiano',15.9,1),(4,'O clássico. Não tem como errar.','assets/img/foods/burger.png','Classic Burger',18.5,2),(5,'Batatas fritas crocantes','assets/img/foods/fries.png','Batatas Fritas',5.5,2),(6,'O refri mais gelado da cidade.','assets/img/foods/coke.png','Refrigerante',4.5,2),(7,'Tradicional cappuccino com chantilly','assets/img/foods/capp.png','Cappuccino com Chantilly',9.9,3),(8,'Café espresso duplo. ','assets/img/foods/espreso.png','Super Espreso',12.5,3),(9,'O mais pedido da casa. O verdadeiro café americano pura água.','assets/img/foods/starb.png','Starbucks Copycat',15.6,3),(10,'Lasagna deliciosa que se salva por causa do queijo','assets/img/foods/zlasagna.png','Lasagna de Zucchini',14.9,4),(11,'Frango grelhado e salada','assets/img/foods/greensandwich.png','Sanduíche de Frango',10.5,4),(12,'Clássica salada ceasar.','assets/img/foods/ceasar.png','Salada Ceasar',33.9,4),(13,'Sunday com várias bolas de sorvete a sua escolha','assets/img/foods/sunday.png','Mega Sunday',21.5,5),(14,'Picolé de brigadeiro recheado com côco.','assets/img/foods/chocpop.png','Picolé de Brigadeiro',8.5,5),(15,'Clássico sorvete de rua onde todos os sabores são idênticos.','assets/img/foods/icestd.png','Sorvete Simples',1.5,5),(16,'Cup Cake de chocolate branco','assets/img/foods/cup.png','Cup Cake de Choc. Branco',5.5,6),(17,'Bolo recheado e coberto com morangos','assets/img/foods/straw.png','Bolo de Morango',40.5,6),(18,'Fatia de bolo de morango','assets/img/foods/cake.png','Fatia de Bolo',5.9,6);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pagamento` (
  `id` bigint(20) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `endereco_opcional` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `pagamento_opcao` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurante`
--

DROP TABLE IF EXISTS `restaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `restaurante` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `categoria` varchar(255) NOT NULL,
  `entrega_estimativa` varchar(255) NOT NULL,
  `horario_funcionamento` varchar(255) NOT NULL,
  `image_path` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `nota` double NOT NULL,
  `sobre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurante`
--

LOCK TABLES `restaurante` WRITE;
/*!40000 ALTER TABLE `restaurante` DISABLE KEYS */;
INSERT INTO `restaurante` VALUES (1,'Bakery','25m','Funciona de segunda à sexta, de 8h às 23h','assets/img/restaurants/breadbakery.png','Bread & Bakery',4.9,'A Bread & Brakery tem 40 anos de mercado. Fazemos os melhores doces e pães. Compre e confira.'),(2,'Hamburgers','100m','Funciona todos os dias, de 10h às 22h','assets/img/restaurants/burgerhouse.png','Burger House',3.5,'40 anos se especializando em trash food.'),(3,'Coffee Shop','30-40m','Funciona de segunda à sábado, de 6h às 22h','assets/img/restaurants/coffeecorner.png','Coffee Corner',4.8,'A Coffe Corner foi eleita a melhor cafeteria da cidade.'),(4,'Saudável','75m','Somente em horário de almoço, das 11h às 15h','assets/img/restaurants/greenfood.png','Green Food',4.1,'Comida saudável é no Green Food. Compramos barato, vendemos caro. ;)'),(5,'Ice Creams','40-65m','Funciona todos os dias, de 10h às 1h','assets/img/restaurants/icy.png','Ice Cream',4.5,'A Ice Cream é uma sorveteria inovadora.'),(6,'Doces','20m','Funciona de segunda à sábado, de 8h às 23h','assets/img/restaurants/tasty.png','Tasty Treats',4.4,'A doceria com mais tradição da cidade');
/*!40000 ALTER TABLE `restaurante` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-28 21:51:08
