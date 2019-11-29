create table manager
(
    MaNo char(4) primary key,
    MaID varchar(13),
    MaPwd char(10)
);
create table businessman
(
    BuNo char(4) primary key,
    BuID varchar(13),
    BuPwd char(10),
    BuName varChar(30),
    BuAdd varChar(30),
    BuTel Char(11)
);
create table usertable
(
    UsID varChar(13) primary key,
    UsPwd Char(10) not null,
    UsTel Char(11)
);
create table catagory
(
    HaCateNo char(4) primary key,
    HaCate varchar(30) not null unique
);
create table brand
(
    HaBrandNo char(4) primary key,
    HaBrand varchar(30) not null unique
);
create table hardware
(
    HaNo Char(10) primary key,
    HaName varchar(30) not null unique,
    HaCate varchar(30),
    HaBrand varchar(30),
    HaPrice Double,
    HaPara varchar(100),
    HaPic varchar(100),
    HaDate DateTime,
foreign key(HaCate)references catagory (HaCate),
foreign key(HaBrand)references brand (HaBrand)
);

CREATE TABLE updateprice
(
  HaNo CHAR(10) NOT NULL,
  HaName VARCHAR(30) NOT NULL,
  BuNo CHAR(4) NOT NULL,
  BuName VARCHAR(30) NOT NULL,
  NowPrice DOUBLE,
  NowDate DateTime,
  FOREIGN KEY(HaNo)REFERENCES hardware (HaNo),
  FOREIGN KEY(BuNo)REFERENCES businessman (BuNo), 
  PRIMARY KEY(HaNo,BuNo,NowDate)
);

alter table hardware drop foreign key hardware_ibfk_1;
alter table hardware drop foreign key hardware_ibfk_2;
alter table hardware add constraint hardware_ibfk_1 foreign key (HaCate) references catagory (HaCate) on delete cascade on update cascade;
alter table hardware add constraint hardware_ibfk_2 foreign key (HaBrand) references brand (HaBrand) on delete cascade on update cascade;

alter table updateprice drop foreign key updateprice_ibfk_1;
alter table updateprice drop foreign key updateprice_ibfk_2;
alter table updateprice add constraint updateprice_ibfk_1 foreign key (HaNo) references hardware (HaNo) on delete cascade on update cascade;
alter table updateprice add constraint updateprice_ibfk_2 foreign key (BuNo) references businessman (BuNo) on delete cascade on update cascade;

ALTER TABLE businessman ADD UNIQUE (BuID);

INSERT INTO manager VALUES('0001','admin1','123456');

INSERT INTO businessman VALUES('0001','bs1','123456','数码之家','金牛区金周路111号','13183623686');
INSERT INTO businessman VALUES('0002','bs2','123123','小黑硬件','郫都区犀安路66号','13540538532');
INSERT INTO businessman VALUES('0003','bs3','123412','科技美学','武侯区武侯大道22号','18728828007');
INSERT INTO businessman VALUES('0004','bs4','123451','久顺电脑城','成华区航天路10号','13018212319');
INSERT INTO usertable VALUE('user1','123456','13540531838');
INSERT INTO catagory VALUES('0001','CPU');
INSERT INTO catagory VALUES('0002','显卡');
INSERT INTO catagory VALUES('0003','主板');
INSERT INTO catagory VALUES('0004','硬盘');

INSERT INTO brand VALUES('0001','Intel');
INSERT INTO brand VALUES('0002','AMD');
INSERT INTO brand VALUES('0003','华硕');
INSERT INTO brand VALUES('0004','七彩虹');
INSERT INTO brand VALUES('0005','三星');

INSERT INTO hardware VALUES('0000000001','酷睿i5-9400F','CPU','Intel',1199,'CPU主频：2.9GHz，动态加速频率：4.1GHz，插槽类型：LGA 1151，二级缓存：1.5MB，核心数量：六核心，线程数：六线程','','2019-10-07');
INSERT INTO hardware VALUES('0000000002','Ryzen 7 3700X','CPU','AMD',2599,'CPU主频：3.6GHz，动态加速频率：4.4GHz，插槽类型：Socket AM4，二级缓存：4MB，核心数量：八核心，线程数：十六线程','','2019-10-07');
INSERT INTO hardware VALUES('0000000003','奔腾 G5400','CPU','Intel',559,'CPU主频：3.7GHz，插槽类型：LGA 1151，三级缓存：4MB，核心数量：双核心，线程数：四线程','','2019-10-07');
INSERT INTO hardware VALUES('0000000004','PRIME B365M-K','主板','华硕',729,'主芯片组：Intel B365，内存类型：2×DDR4 DIMM，主板板型：Micro ATX板型，电源插口：一个8针，一个24针电源接口','','2019-10-07');
INSERT INTO hardware VALUES('0000000005','iGame Z390 Vulcan X V20','主板','七彩虹',1599,'主芯片组：Intel Z390，内存类型：4×DDR4 DIMM，最大内存容量：64GB，主板板型：ATX板型','','2019-10-07');
INSERT INTO hardware VALUES('0000000006','PRIME Z390-A','主板','华硕',1999,'主芯片组：Intel Z390，内存类型：4×DDR4 电源插口：一个8针，一个24针电源接口','','2019-10-07');
INSERT INTO hardware VALUES('0000000007','iGame1050Ti 烈焰战神U-4GD5','显卡','七彩虹',1249,'显卡芯片：GeForce GTX 1050Ti，核心频率：1290/1493MHz，显存频率：7000MHz，显存容量：4GB，显存位宽：128bit','','2019-10-07');
INSERT INTO hardware VALUES('0000000008','三星860 QVO SATA III','硬盘','三星',749,'存储容量：1TB，硬盘尺寸：2.5英寸，接口类型：SATA3（6Gbps），读取速度：550MB/s，写入速度：520MB/s','','2019-10-07');

INSERT INTO updateprice VALUES('0000000001','酷睿i5-9400F','0001','数码之家',1199,'2019-10-08');
INSERT INTO updateprice VALUES('0000000001','酷睿i5-9400F','0002','小黑硬件',1099,'2019-10-08');
INSERT INTO updateprice VALUES('0000000001','酷睿i5-9400F','0003','科技美学',1259,'2019-10-08');
INSERT INTO updateprice VALUES('0000000002','Ryzen 7 3700X','0001','数码之家',2689,'2019-10-08');
INSERT INTO updateprice VALUES('0000000002','Ryzen 7 3700X','0002','小黑硬件',2789,'2019-10-08');
INSERT INTO updateprice VALUES('0000000002','Ryzen 7 3700X','0003','科技美学',2599,'2019-10-08');
INSERT INTO updateprice VALUES('0000000002','Ryzen 7 3700X','0004','久顺电脑城',2099,'2019-10-08');
INSERT INTO updateprice VALUES('0000000003','奔腾 G5400','0004','久顺电脑城',549,'2019-10-08');
INSERT INTO updateprice VALUES('0000000003','奔腾 G5400','0003','科技美学',569,'2019-10-08');

    insert into `hardware` (`HaNo`, `HaName`, `HaCate`, `HaBrand`, `HaPrice`, `HaPara`, `HaPic`, `HaDate`) values('0000000007','iGame1050Ti 烈焰战神U-4GD5','显卡','七彩虹','1249','显卡芯片：GeForce GTX 1050Ti，核心频率：1290/1493MHz，显存频率：7000MHz，显存容量：4GB，显存位宽：128bit','/DatabasePT/img/显卡01.jpg','2019-10-07 00:00:00');