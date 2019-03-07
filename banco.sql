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
-- Table structure for table `avaliacao`
--

DROP TABLE IF EXISTS `avaliacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `avaliacao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `avaliacao` float NOT NULL,
  `comentario` varchar(255) NOT NULL,
  `data` varchar(255) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_restaurante` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8c1kfi081k6knp34rr6nxw3ia` (`id_restaurante`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avaliacao`
--

LOCK TABLES `avaliacao` WRITE;
/*!40000 ALTER TABLE `avaliacao` DISABLE KEYS */;
INSERT INTO `avaliacao` VALUES (1,4.5,'Tudo muito bom, entrega no tempo certo','2017-01-23T18:25:43','Julia',1),(2,3,'NÃO recomendo. O recheio é só um creme, não tem camarão e nem carne','2016-12-12T18:25:43','Aline',1),(3,2,'Não foi muito agradável ao nosso paladar, e eu e meu esposo no outro dia passamos super mal. Pode até ter sido outra coisa, mas...','2016-12-12T18:25:43','Renata',1),(4,5,'Nunca deixou na mão, comida sempre deliciosa.','2016-12-12T18:25:43','Renata',1),(5,5,'Melhor hambúrguer que já provei. Vai ser difícil voltar para mc e bk','2017-02-02T18:25:43','Laila',2),(6,3.5,'Meu sanduíche chegou frio e todo desmontado =\\','2016-12-12T18:25:43','Suzana',2),(7,4.5,'Excelente opção! Recomendo!','2017-01-23T18:25:43','Eric',3),(8,2.5,'Demorou muito e o café veio gelado','2017-02-02T18:25:43','Amanda',3),(9,4.8,'Tudo perfeito. Entrega, embalagem, comida. Resultado? Melhor custo beneficio','2016-12-12T18:25:43','Carla',3),(10,4,'Muito rápida a entrega, mas é caro.','2016-12-12T18:25:43','Rodrigo',3),(11,4.5,'Excelente como sempre!','2016-12-12T18:25:43','André',3),(12,5,'Excelente. Fiz o pedido com outro endereço e quando vi o erro liguei avisando. O motoqueiro cortou a cidade todinha e a comida ainda chegou quentinha (e deliciosa). Estou sempre pedindo e recomendando','2017-01-23T18:25:43','João',4),(13,4.5,'Chegou muito rápido, antes mesmo da previsão','2017-02-02T18:25:43','Marcelo',4),(14,2,'Ñ gostei dos sabores q pedi e achei o preço muito elevado','2017-01-23T18:25:43','Fatinha',5),(15,2.5,'Esperar 1:45hr pra receber o pedido é INACEITÁVEL','2017-02-02T18:25:43','Lucas',5),(16,4.5,'Veio OK!','2017-02-01T18:25:43','Jacira',5),(17,5,'Rápido e sempre uma delicia!! Ja pedi 3x e sempre veio rapido e tudo certinho.','2017-01-23T18:25:43','Ana',6),(18,2.5,'A taxa de entrega poderia ser mais barata.','2017-02-02T18:25:43','Larissa',6),(19,4.7,'Excelente e chegou muito rápido!','2016-12-15T18:25:43','Jarbas',6),(20,5,'Chegou rápido e perfeito!','2017-01-12T18:25:43','Rafaela',6),(21,1.5,'Sempre gostei muito dos pedidos que eu fiz, mas dessa vez foi péssimo e decepcionou muito. Demorou 30min a mais pra chegar do que o tempo máximo esperado.','2016-12-12T18:25:43','Julia',6),(22,4.5,'Taxa de entrega bastante elevada e precisa colocar no app se a pessoa quer porção adicional de algo (calda, crocante etc)','2016-12-20T18:25:43','Marília',6);
/*!40000 ALTER TABLE `avaliacao` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `hibernate_sequence` VALUES (176),(176);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_pedido`
--

DROP TABLE IF EXISTS `item_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `item_pedido` (
  `id` bigint(20) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `id_menu` bigint(20) NOT NULL,
  `id_pedido` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs7fj7osvql0ll20tu6j22kodk` (`id_menu`),
  KEY `FKnjghutiejefh2auj9bnpf9sp7` (`id_pedido`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_pedido`
--

LOCK TABLES `item_pedido` WRITE;
/*!40000 ALTER TABLE `item_pedido` DISABLE KEYS */;
INSERT INTO `item_pedido` VALUES (140,1,1,NULL),(142,2,1,NULL),(143,1,2,NULL),(144,1,3,NULL),(146,1,7,NULL),(147,1,8,NULL),(148,1,9,NULL),(151,1,1,NULL),(154,1,1,NULL),(157,1,1,NULL),(160,1,1,NULL),(163,1,1,NULL),(166,1,1,NULL),(168,1,1,NULL),(170,1,1,NULL),(172,1,2,NULL),(174,1,7,NULL),(175,1,9,NULL);
/*!40000 ALTER TABLE `item_pedido` ENABLE KEYS */;
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
INSERT INTO `menu` VALUES (1,'Torresmo frito ','assets/img/foods/cupcake.png','Torresmo',8.7,1),(2,'Biscoito coberto com mel','assets/img/foods/donut.png','Biscoito',2.5,1),(3,'Pão artesanal com queijos italianos','assets/img/foods/bread.png','Pão Artesanal Italiano',15.9,1),(4,'O clássico. Não tem como errar.','assets/img/foods/burger.png','Hambúrger',18.5,2),(5,'Batatas fritas crocantes','assets/img/foods/fries.png','Batatas Fritas',5.5,2),(6,'O refri mais gelado da cidade.','assets/img/foods/coke.png','Refrigerante',4.5,2),(7,'Tradicional café com chantilly','assets/img/foods/capp.png','Café com Chantilly',9.9,3),(8,'Café espresso duplo. ','assets/img/foods/espreso.png','Super Espreso',12.5,3),(9,'O mais pedido da casa. O verdadeiro café com leite.','assets/img/foods/starb.png','Café com leite',15.6,3),(10,'Lasagna deliciosa que se salva por causa do queijo','assets/img/foods/zlasagna.png','Lasagna de Zucchini',14.9,4),(11,'Frango grelhado e salada','assets/img/foods/greensandwich.png','Sanduíche de Frango',10.5,4),(12,'Clássica salada ceasar.','assets/img/foods/ceasar.png','Salada Ceasar',33.9,4),(13,'Sunday com várias bolas de sorvete a sua escolha','assets/img/foods/sunday.png','Mega Sunday',21.5,5),(14,'Picolé de brigadeiro recheado com côco.','assets/img/foods/chocpop.png','Picolé de Brigadeiro',8.5,5),(15,'Clássico sorvete de rua onde todos os sabores são idênticos.','assets/img/foods/icestd.png','Sorvete Simples',1.5,5),(16,'Bolo de chocolate branco','assets/img/foods/cup.png','Bolo de Choc. Branco',5.5,6),(17,'Bolo recheado e coberto com morangos','assets/img/foods/straw.png','Bolo de Morango',40.5,6),(18,'Fatia de bolo de morango','assets/img/foods/cake.png','Fatia de Bolo',5.9,6);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pedido` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `endereco_opcional` varchar(255) DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `pagamento_opcao` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (129,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(131,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(133,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(135,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(137,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(139,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(141,'k@k.com','sssssssssssssssssss','654','jkhfkjhdjkfhkjkj',321,'MON'),(145,'a@a.com','ffffffffffffffff','','Leojhjhjh',54,'DEB'),(150,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(153,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(156,'k@h.com','jlkkjhkjhkj','','GGGGGG',321,'MON'),(159,'leo@leo.com','dsdsdsdsd','casa','Leonardo ',32,'DEB'),(162,'leo@leo.com','dsdsdsdsd','casa','Leonardo ',32,'DEB'),(165,'leo@leo.com','dsdsdsdsd','casa','Leonardo ',32,'DEB'),(167,'leo@leo.com','dsdsdsdsd','casa','Leonardo ',32,'DEB'),(169,'l@l.com','wwwwwwwwwwwwww','','sssssssssssss',2,'MON'),(171,'l@l.com','fffff','','aaaaaa',123,'MON'),(173,'leo@leo.com','Endereco','Casa','sssssssssss',332,'DEB');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
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
INSERT INTO `restaurante` VALUES (1,'Bar','25m','Funciona de segunda à sexta, de 8h às 23h','assets/img/restaurants/breadbakery.png','Bar de Minas',4.9,'A Bread & Brakery tem 40 anos de mercado. Fazemos os melhores doces e pães. Compre e confira.'),(2,'Hambúrgueria','100m','Funciona todos os dias, de 10h às 22h','assets/img/restaurants/burgerhouse.png','Rei de Hambúrguer',3.5,'40 anos se especializando em trash food.'),(3,'Cafeteria','30-40m','Funciona de segunda à sábado, de 6h às 22h','assets/img/restaurants/coffeecorner.png','Café do Tião',4.8,'A Coffe Corner foi eleita a melhor cafeteria da cidade.'),(4,'Saudável','75m','Somente em horário de almoço, das 11h às 15h','assets/img/restaurants/greenfood.png','Só Alface',4.1,'Comida saudável é no Green Food. Compramos barato, vendemos caro. ;)'),(5,'Sorveteria','40-65m','Funciona todos os dias, de 10h às 1h','assets/img/restaurants/icy.png','Quatro estações ',4.5,'A Ice Cream é uma sorveteria inovadora.'),(6,'Doceria','20m','Funciona de segunda à sábado, de 8h às 23h','assets/img/restaurants/tasty.png','Doces da Mãe',4.4,'A doceria com mais tradição da cidade');
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

-- Dump completed on 2019-03-06 21:56:30
