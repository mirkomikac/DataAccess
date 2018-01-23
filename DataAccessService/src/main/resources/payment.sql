--POLISE U DRUGOJ BAZI
insert into payment.osiguranje(id, datumSklapanja) values(1, '2017-08-14 00:00:00');
insert into payment.osiguranje(id, datumSklapanja) values(2, '2017-08-14 00:00:00');

--UPLATE ZA POLISE
insert into payment.uplata(id, datumUplate, status, osiguranje_id, tipUplate) values(1, '2017-08-16 00:00:00', 'UPLACENO', 1, 'PAYPAL');
insert into payment.uplata(id, datumUplate, status, osiguranje_id, tipUplate) values(2, '2017-08-16 00:00:00', 'NA_OBRADI', 2, 'ACQUIRER');
