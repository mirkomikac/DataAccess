--POLISE U DRUGOJ BAZI
insert into payment.osiguranje(id, datumSklapanja, iznos) values(1, '2017-08-14 00:00:00', 3578.36);
insert into payment.osiguranje(id, datumSklapanja, iznos) values(2, '2017-08-14 00:00:00', 1637.85);

--UPLATE ZA POLISE
insert into payment.uplata(id, datumUplate, status, osiguranje_id, tipUplate, iznos) values(1, '2017-08-16 00:00:00', 'UPLACENO', 1, 'PAYPAL', 3578.36);
insert into payment.uplata(id, datumUplate, status, osiguranje_id, tipUplate, iznos) values(2, '2017-08-16 00:00:00', 'NA_OBRADI', 2, 'ACQUIRER', 1637.85);
