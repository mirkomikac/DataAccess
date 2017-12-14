--POLISE U DRUGOJ BAZI
insert into payment.polisa(id, cena) values (1, 1000);

--UPLATE ZA POLISE
insert into payment.uplata(id, datumUplate, status, polisa_id) values(1, '2017-08-16 00:00:00', 'UPLACENO', 1);
