--OSIGURAVAJUCE KUCE
insert into osiguravajucakuca(id, adresa, mesto, naziv, pib, telefon) values (1, 'Nikole Pasica 26', 'Novi Sad', 'Uniqa', '54379126', '021/2100-260');
insert into osiguravajucakuca(id, adresa, mesto, naziv, pib, telefon) values (2, 'Ljubomira Davidovica 30', 'Novi Sad', 'Grawe', '89779126', '021/2100-300');

--PODRZANI TIPOVI OSIGURANJA
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(1, 2, 'Medjunarodno putno osiguranje', 1);
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(2, 2, 'Osiguranje nepokretnosti', 1);
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(3, 2, 'Osiguranje pomoci na putu', 1);

--KONTEKST ATRIBURA
insert into kontekstatributa(id, naziv, redniBrojForme, visestrukoDodavanje) values(1, 'Korisnik', 2, true);
insert into kontekstatributa(id, naziv, redniBrojForme, visestrukoDodavanje) values(2, 'Nepokretnost', 2, false);
insert into kontekstatributa(id, naziv, redniBrojForme, visestrukoDodavanje) values(3, 'Osiguranje', 1, false);
insert into kontekstatributa(id, naziv, redniBrojForme, visestrukoDodavanje) values(4, 'Vozilo', 2, false);

--ATRIBUTI PODRZANIH OSIGURANJA
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(1, 'NUMBER', 'Trajanje osiguranja', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(34, 'DATE', 'Datum pocetka', true, 3);

--ATRIBUTI MEDJUNARODNOG PUTNOG OSIGURANJA
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(2, 'TEXT', 'Region u koji se putuje', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(3, 'NUMBER', 'Broj osoba', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(4, 'TEXT', 'Starost osoba', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(5, 'TEXT', 'Kojim sportom se korisnik bavi', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(6, 'TEXT', 'Do kog iznosa je korisnik osiguran', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(7, 'TEXT', 'Ime', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(8, 'TEXT', 'Prezime', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(9, 'NUMBER', 'JMBG', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(10, 'NUMBER', 'Broj pasosa', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(11, 'TEXT', 'Adresa', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(12, 'TEXT', 'Broj telefona', true, 1);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(13, 'EMAIL', 'Email', false, 1);

--ATRIBUTI OSIGURANJA NEPOKRETNOSTI
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(14, 'TEXT', 'Povrsina nepokretnosti', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(15, 'TEXT', 'Starost nepokretnosti', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(16, 'TEXT', 'Procenjena vrednost nepokretnosti', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(17, 'TEXT', 'Od cega se osigurava', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(18, 'TEXT', 'Adresa nepokretnosti', true, 2);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(19, 'TEXT', 'Ime vlasnika', true, 2);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(20, 'TEXT', 'Prezime vlasnika', true, 2);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(21, 'TEXT', 'JMBG vlasnika', true, 2);

--ATRIBUTI OSIGURANJA POMOCI NA PUTU
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(22, 'TEXT', 'Slepovanje do odredjenje kilometraze', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(23, 'TEXT', 'Popravka do odredjenje cene', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(24, 'TEXT', 'Smestaj u hotelu do odredjenjenog broja dana', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(25, 'TEXT', 'Alternativni prevoz', true, 3);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(26, 'TEXT', 'Marka vozila', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(27, 'TEXT', 'Tip vozila', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(28, 'NUMBER', 'Godina proizvodnje', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(29, 'TEXT', 'Broj registarske oznake', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(30, 'TEXT', 'Broj sasije', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(31, 'TEXT', 'Ime vlasnika', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(32, 'TEXT', 'Prezime vlasnika', true, 4);
insert into tipatributa(id, domen, naziv, obavezan, kontekst_id) values(33, 'TEXT', 'JMBG vlasnika', true, 4);

--MEDJUNARODNO PUTNO OSIGURANJE POSEDUJE SLEDECE ATRIBUTE
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(1, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(2, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(3, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(4, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(5, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(6, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(7, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(8, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(9, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(10, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(11, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(12, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(13, 1);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(34, 1);

--OSIGURANJE NEPOKRETNOSTI POSEDUJE SLEDECE ATRIBUTE
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(1, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(14, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(15, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(16, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(17, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(18, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(19, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(20, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(21, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(34, 2);

--OSIGURANJE POMOCI NA PUTU POSEDUJE SLEDECE ATRIBUTE
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(1, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(22, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(23, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(24, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(25, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(26, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(27, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(28, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(29, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(30, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(31, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(32, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(33, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(34, 3);

--PREDEFINISANE VREDNOSTI ZA MEDJUNARODNO PUTNO OSIGURANJE
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(1, 'Evropa', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(2, 'Azija', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(3, 'Severna Amerika', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(4, 'Juzna Amerika', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(5, 'Afrika', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(6, 'Australija', 2);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(7, 'Do 18 godina', 4);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(8, 'Od 18 do 60 godina', 4);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(9, 'Preko 60 godina', 4);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(10, 'Ne bavi se sportom', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(11, 'Fudbal', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(12, 'Kosarka', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(13, 'Boks', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(14, 'Automobilizam', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(15, '10.000 EUR', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(16, '30.000 EUR', 6);

--PREDEFINISANE VREDNOSTI ZA OSIGURANJE NEPOKRETNOSTI
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(17, 'Manje od 30 kvadratnih metara', 14);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(18, 'Od 30 do 80 kvadratnih metara', 14);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(19, 'Preko 80 kvadratnih metara', 14);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(20, 'Manje od 10 godina', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(21, 'Od 10 do 20 godina', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(22, 'Vise od 20 godina', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(23, 'Manje od 50.000 EUR', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(24, 'Od 50.000 do 100.000 EUR', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(25, 'Vise od 100.000 EUR', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(26, 'Poplava', 17);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(27, 'Kradja', 17);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(28, 'Pozar', 17);

--PREDEFINISANE VREDNOSTI ZA OSIGURANJE POMOCI NA PUTU
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(29, 'Do 100 km', 22);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(30, 'Od 100 do 300 km', 22);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(31, 'Preko 300 km', 22);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(32, 'Do 500 EUR', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(33, 'Od 500 do 1500 EUR', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(34, 'Preko 1500 EUR', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(35, 'Do 3 dana', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(36, 'Od 3 do 7 dana', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(37, 'Preko 7 dana', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(38, 'Avion', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(39, 'Voz', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(40, 'Autobus', 25);

--CENOVNICI
insert into cenovnik(id, datumDo, datumOd, osiguravajucaKuca_id) values(1, '2017-06-1 00:00:00', '2017-12-31 00:00:00', 1);

--STAVKE CENOVNIKA ZA MEDJUNARNODNO PUTNO OSIGURANJE
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(1, 700, 1, 1);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(2, 800, 1, 2);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(3, 900, 1, 3);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(4, 1000, 1, 4);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(5, 1500, 1, 5);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(6, 1200, 1, 6);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(7, 400, 1, 7);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(8, 500, 1, 8);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(9, 600, 1, 9);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(10, 0, 1, 10);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(11, 300, 1, 11);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(12, 300, 1, 12);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(13, 500, 1, 13);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(14, 400, 1, 14);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(15, 200, 1, 15);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(16, 400, 1, 16);

--STAVKE CENOVNIKA ZA OSIGURANJE NEPOKRETNOSTI
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(17, 400, 1, 17);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(18, 600, 1, 18);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(19, 800, 1, 19);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(20, 200, 1, 20);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(21, 300, 1, 21);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(22, 500, 1, 22);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(23, 150, 1, 23);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(24, 200, 1, 24);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(25, 250, 1, 25);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(26, 175, 1, 26);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(27, 215, 1, 27);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(28, 225, 1, 28);

--STAVKE CENOVNIKA ZA OSIGURANJE POMOCI NA PUTU
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(29, 200, 1, 29);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(30, 250, 1, 30);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(31, 300, 1, 31);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(32, 400, 1, 32);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(33, 500, 1, 33);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(34, 600, 1, 34);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(35, 500, 1, 35);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(36, 600, 1, 36);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(37, 700, 1, 37);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(38, 10000, 1, 38);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(39, 6000, 1, 39);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(40, 5500, 1, 40);

--KLIJENTI
insert into klijent(id, adresa, brojPasosa, brojTelefona, email, ime, jmbg, prezime) values(1, 'Doze Djerdja 7 Novi Sad', '00000007', '0641783647','stefan.varajic@email.com', 'Stefan', '1501389800000', 'Varajic');

--POLISE
insert into polisa(id, cena, datumSklapanja, klijent_id) values(1, 1000, '2017-08-14 00:00:00', 1);

--OSIGURANJA
insert into osiguranje(id, polisa_id, tipOsiguranja_id) values(1, 1, 1);
insert into osiguranje(id, polisa_id, tipOsiguranja_id) values(2, 1, 3);

--VREDNOSTI ZA MEDJUNARODNO PUTNO OSIGURANJE
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(1, '2017-08-15 00:00:00', 1, 34);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(2, '5', 1, 1);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(3, 'Evropa', 1, 2);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(4, '2', 1, 3);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(5, 'Od 18 do 60 godina', 1, 4);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(6, 'Ne bavi se sportom', 1, 5);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(7, '30.000 EUR', 1, 6);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(8, 'Marko', 1, 7);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(9, 'Kljajic', 1, 8);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(10, '2402994800100', 1, 9);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(11, '00117280', 1, 10);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(12, 'Rumenacka 15 Novi Sad', 1, 11);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(13, '0647772159', 1, 12);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(14, 'marko.kljajic@email.com', 1, 13);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(15, 'Stefan', 1, 7);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(16, 'Varajic', 1, 8);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(17, '1501389800000', 1, 9);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(18, '00000007', 1, 10);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(19, 'Doze Djerdja 7 Novi Sad', 1, 11);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(20, '0641783647', 1, 12);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(21, 'stefan.varajic@email.com', 1, 13);

--VREDNOSTI ZA OSIGURANJE POMOCI NA PUTU
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(22, '2017-08-15 00:00:00', 2, 34);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(23, '4', 2, 1);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(24, 'Od 500 do 1500 EUR', 2, 23);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(25, 'Mercedes', 2, 26);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(26, 'Putnicko', 2, 27);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(27, '2007', 2, 28);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(28, 'NS315HG', 2, 29);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(29, '16984847', 2, 30);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(30, 'Nikola', 2, 31);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(31, 'Sajic', 2, 32);
insert into vrednostatributaosiguranja(id, vrednost, osiguranje_id, tipAtributa_id) values(32, '2407994780147', 2, 33);