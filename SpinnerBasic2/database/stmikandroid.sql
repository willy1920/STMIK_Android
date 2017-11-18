-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2017 at 03:18 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stmikandroid`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahaiswa`
--

CREATE TABLE `mahaiswa` (
  `nim` varchar(50) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahaiswa`
--

INSERT INTO `mahaiswa` (`nim`, `nama`) VALUES
('152101490', 'Steven Yoka'),
('152101491', 'Jevon'),
('152101492', 'Andi'),
('152101493', 'Willy'),
('152101498', 'Michelle'),
('152101503', 'Tatum'),
('152101533', 'Gerry'),
('1521015391', 'Apriadi Wijaya'),
('152101593', 'Wira'),
('1521015938', 'Lukas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahaiswa`
--
ALTER TABLE `mahaiswa`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
