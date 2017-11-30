-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2017 at 12:02 PM
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
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `thnMasuk` int(11) NOT NULL,
  `tglLahir` date NOT NULL,
  `tmptLahir` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahaiswa`
--

INSERT INTO `mahaiswa` (`nim`, `nama`, `alamat`, `jk`, `jurusan`, `status`, `thnMasuk`, `tglLahir`, `tmptLahir`) VALUES
('152101490', 'Steven Yoka', 'Kota Baru', 'Laki-laki', 'TI / TI', 'Belum Menikah', 2015, '1996-10-09', 'Bekasi'),
('152101491', 'Jevon', 'Kota Baru', 'Laki-laki', 'TI / TI', 'Belum Menikah', 2015, '1997-02-28', 'Samarinda'),
('152101492', 'Andi', 'Jl. Pahlawan', 'Laki-laki', 'TI / TI', 'Belum Menikah', 2015, '1994-04-27', 'Ambawang'),
('152101493', 'Willy', 'Jl. Merdeka Gg. Bangau No.69', 'Laki-laki', 'TI / TI', 'Belum Menikah', 2015, '1996-10-05', 'Singkawang'),
('152101498', 'Michelle', 'Pasar Mawah', 'Perempuan', 'TI / TI', 'Menikah', 2015, '1997-10-06', 'Singkawang'),
('152101503', 'Tatum', 'Siantan', 'Perempuan', 'TI / TI', 'Tunangan', 2015, '1997-07-28', 'Siantan'),
('152101533', 'Gerry', 'Sungai Raya Dalam', 'Laki-laki', 'TI / TI', 'Duda', 2015, '1997-09-18', 'Pontianak'),
('1521015391', 'Apriadi Wijaya', 'Jeruru', 'Laki-laki', 'TI / TI', 'Janda', 2015, '1945-08-17', 'Pontianak'),
('152101593', 'Wira', 'Gak tau', 'Gak Jelas', 'TI / TI', 'Menikah', 2015, '1997-12-12', 'Pontianak'),
('1521015938', 'Lukas', 'Purnama', 'Laki-laki', 'TI / TI', 'Menikah', 2015, '1990-07-28', 'Pontianak');

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
