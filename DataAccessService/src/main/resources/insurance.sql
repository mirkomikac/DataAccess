--OSIGURAVAJUCE KUCE
insert into osiguravajucakuca(id, adresa, mesto, naziv, pib, telefon) values (1, 'Nikole Pasica 26', 'Novi Sad', 'Uniqa', '54379126', '021/2100-260');
insert into osiguravajucakuca(id, adresa, mesto, naziv, pib, telefon) values (2, 'Ljubomira Davidovica 30', 'Novi Sad', 'Grawe', '89779126', '021/2100-300');

--PODRZANI TIPOVI OSIGURANJA
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(1, 5, 'Medjunarodno putno osiguranje', 1);
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(2, 5, 'Osiguranje nepokretnosti', 1);
insert into tiposiguranja(id, brojFormi, naziv, osiguravajucaKuca_id) values(3, 4, 'Osiguranje pomoci na putu', 1);

--KONTEKST ATRIBURA
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(1, 'Korisnik', false, 5, true);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(2, 'Nepokretnost', false, 5, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(3, 'Pocetak i trajanje osiguranja', false, 2, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(4, 'Vozilo', false, 4, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(5, 'Broj osoba i svrha putovanja', false, 4, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(6, 'Starost osoba i destinacija', false, 3, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(7, 'Povrsina i starost nepokretnosti', false, 3, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(8, 'Procenjena vrednost i svrha osiguranja', false, 4, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(9, 'Paket koji se zeli kupiti', true, 3, false);
insert into kontekstatributa(id, naziv, predstavljaGrupu, redniBrojForme, visestrukoDodavanje) values(10, 'Osiguravac', false, 1, false);

--KONTEKSTI ATRIBUTA ZA MEDJUNARODNO PUTNO OSIGURANJE
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (1, 1);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (1, 3);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (1, 5);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (1, 6);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (1, 10);


--KONTEKSTI ATRIBUTA ZA OSIGURANJE NEPOKRETNOSTI
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (2, 2);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (2, 3);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (2, 7);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (2, 8);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (2, 10);

--KONTEKSTI ATRIBUTA ZA OSIGURANJE POMOCI NA PUTU
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (3, 3);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (3, 4);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (3, 9);
insert into tiposiguranja_kontekstatributa(tipoviOsiguranja_id, konteksti_id) values (3, 10);

--ATRIBUTI PODRZANIH OSIGURANJA
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(1, 'DATE', null, null, 'Datum pocetka', true, null, true, false, 3);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(2, 'DATE', null, null, 'Datum zavrsetka', true, null, true, true, 3);

--ATRIBUTI MEDJUNARODNOG PUTNOG OSIGURANJA
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(3, 'TEXT', null, null, 'Region u koji se putuje', true, null, false, true, 6);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(4, 'NUMBER', 30, 1, 'Broj osoba', true, '\\d+', true, true, 5);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(5, 'TEXT', null, null, 'Starost osoba', true, null, false, true, 6);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(6, 'TEXT', null, null, 'Kojim sportom se korisnik bavi', true, null, false, true, 5);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(7, 'TEXT', null, null, 'Do kog iznosa je korisnik osiguran', true, null, false, true, 6);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(8, 'TEXT', 40, 1, 'Ime korisnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 1);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(9, 'TEXT', 40, 1, 'Prezime korisnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 1);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(10, 'NUMBER', 13, 13, 'JMBG korisnika', true, '\\d+', true, false, 1);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(11, 'NUMBER', 25, 1, 'Broj pasosa', true, '\\d+', true, false, 1);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(12, 'TEXT', 80, 1, 'Adresa', true, '^[a-zA-Z]+[a-zA-Z ]+[\\d]+$', true, false, 1);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(13, 'NUMBER', 20, 1, 'Broj telefona', true, '\\d+', true, false, 1);


--ATRIBUTI OSIGURANJA NEPOKRETNOSTI
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(15, 'TEXT', null, null, 'Povrsina nepokretnosti', true, null, false, true, 7);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(16, 'TEXT', null, null, 'Starost nepokretnosti', true, null, false, true, 7);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(17, 'TEXT', null, null, 'Procenjena vrednost nepokretnosti', true, null, false, true, 8);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(18, 'TEXT', null, null, 'Od cega se osigurava', true, null, false, true, 8);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(19, 'TEXT', 80, 1, 'Adresa nepokretnosti', true, '^[a-zA-Z]+[a-zA-Z ]+[\\d]+$', true, false, 2);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(20, 'TEXT', 40, 1, 'Ime vlasnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 2);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(21, 'TEXT', 40, 1, 'Prezime vlasnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 2);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(22, 'NUMBER', 13, 13, 'JMBG vlasnika', true, '\\d+', true, false, 2);

--ATRIBUTI OSIGURANJA POMOCI NA PUTU
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(23, 'TEXT', null, null, 'Slepovanje do odredjenje kilometraze', true, null, false, true, 9);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(24, 'TEXT', null, null, 'Popravka do odredjenje cene', true, null, false, true, 9);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(25, 'TEXT', null, null, 'Smestaj u hotelu do odredjenjenog broja dana', true, null, false, true, 9);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(26, 'TEXT', null, null, 'Alternativni prevoz', true, null, false, true, 9);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(27, 'TEXT', 40, 1, 'Marka vozila', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(28, 'TEXT', 40, 1, 'Tip vozila', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(29, 'NUMBER', 4, 4, 'Godina proizvodnje', true, '\\d+', true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(30, 'TEXT', 30, 1, 'Broj registarske oznake', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z\\d]*)*$", true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(31, 'TEXT', 40, 1, 'Broj sasije', true, '^[a-zA-Z]+[a-zA-Z ]+[\\d]+$', true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(32, 'TEXT', 40, 1, 'Ime vlasnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(33, 'TEXT', 40, 1, 'Prezime vlasnika', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 4);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(34, 'NUMBER', 13, 13, 'JMBG vlasnika', true, '\\d+', true, false, 4);

--ATRIBUTI
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(35, 'TEXT', 40, 1, 'Ime osiguravaca', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(36, 'TEXT', 40, 1, 'Prezime osiguravaca', true, "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(37, 'NUMBER', 13, 13, 'JMBG osiguravaca', true, '\\d+', true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(38, 'NUMBER', 25, 1, 'Broj pasosa', true, '\\d+', true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(39, 'TEXT', 80, 1, 'Adresa', true, '^[a-zA-Z]+[a-zA-Z ]+[\\d]+$', true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(40, 'NUMBER', 20, 1, 'Broj telefona', true, '\\d+', true, false, 10);
insert into tipatributa(id, domen, maksimalnaDuzina, minimalnaDuzina, naziv, obavezan, regex, slobodnoPolje, uticeNaCenu, kontekst_id) values(14, 'EMAIL', 50, 1, 'Email', true, '^[a-zA-Z\\d]+[@ ][a-z\\d]+\\.[a-z]+$', true, false, 10);


--KONTROLNI ATRIBUTI
insert into kontrolniatribut(id, kontekstAtributa_id, tipAtributa_id) values(1, 1, 4);

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
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(14, 1);

--OSIGURANJE NEPOKRETNOSTI POSEDUJE SLEDECE ATRIBUTE
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(1, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(2, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(15, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(16, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(17, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(18, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(19, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(20, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(21, 2);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(22, 2);

--OSIGURANJE POMOCI NA PUTU POSEDUJE SLEDECE ATRIBUTE
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(1, 3);
insert into tipatributa_tiposiguranja(tipoviAtributa_id, tipoviOsiguranja_id) values(2, 3);
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
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(1, 'Evropa', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(2, 'Azija', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(3, 'Severna Amerika', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(4, 'Juzna Amerika', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(5, 'Afrika', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(6, 'Australija', 3);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(7, 'Do 18 godina', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(8, 'Od 18 do 60 godina', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(9, 'Preko 60 godina', 5);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(10, 'Ne bavi se sportom', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(11, 'Fudbal', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(12, 'Kosarka', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(13, 'Boks', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(14, 'Automobilizam', 6);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(15, '10.000 EUR', 7);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(16, '30.000 EUR', 7);

--PREDEFINISANE VREDNOSTI ZA OSIGURANJE NEPOKRETNOSTI
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(17, 'Manje od 30 kvadratnih metara', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(18, 'Od 30 do 80 kvadratnih metara', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(19, 'Preko 80 kvadratnih metara', 15);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(20, 'Manje od 10 godina', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(21, 'Od 10 do 20 godina', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(22, 'Vise od 20 godina', 16);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(23, 'Manje od 50.000 EUR', 17);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(24, 'Od 50.000 do 100.000 EUR', 17);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(25, 'Vise od 100.000 EUR', 17);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(26, 'Poplava', 18);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(27, 'Kradja', 18);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(28, 'Pozar', 18);

--PREDEFINISANE VREDNOSTI ZA OSIGURANJE POMOCI NA PUTU
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(29, 'Nema', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(30, 'Do 100 km', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(31, 'Do 300 km', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(32, 'Preko 300 km', 23);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(33, 'Nema', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(34, 'Do 500 EUR', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(35, 'Do 1500 EUR', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(36, 'Preko 1500 EUR', 24);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(37, 'Nema', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(38, 'Do 3 dana', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(39, 'Do 7 dana', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(40, 'Preko 7 dana', 25);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(41, 'Nema', 26);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(42, 'Avion', 26);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(43, 'Voz', 26);
insert into predefinisanavrednost(id, konkretnaVrednost, tipAtributa_id) values(44, 'Autobus', 26);

--CENOVNICI
insert into cenovnik(id, aktuelan, datumDo, datumOd, osiguravajucaKuca_id) values(1, true, '2018-03-07 00:00:00', '2017-06-01 00:00:00', 1);

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
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(41, 0, 1, 41);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(42, 6500, 1, 42);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(43, 4300, 1, 43);
insert into stavkacenovnika(id, suma, cenovnik_id, predefinisanaVrednost_id) values(44, 2000, 1, 44);

--KLIJENTI
insert into klijent(id, adresa, brojPasosa, brojTelefona, email, ime, jmbg, prezime) values(1, 'Doze Djerdja 7 Novi Sad', '00000007', '0641783647','mmikac27@gmail.com', 'Stefan', '1501389800000', 'Varajic');

--OSIGURANJA
insert into osiguranje(id, datumSklapanja, iznos, klijent_id, tipOsiguranja_id) values(1, '2017-08-14 00:00:00', 3578.36, 1, 1);
insert into osiguranje(id, datumSklapanja, iznos, klijent_id, tipOsiguranja_id) values(2, '2017-08-14 00:00:00', 1637.85, 1, 3);

--VREDNOSTI ZA MEDJUNARODNO PUTNO OSIGURANJE
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(1, 0, '2017-08-15 00:00:00', 1, 1);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(2, 0, '2017-08-25 00:00:00', 1, 2);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(3, 0, 'Evropa', 1, 3);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(4, 0, '2', 1, 4);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(5, 0, 'Od 18 do 60 godina', 1, 5);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(6, 0, 'Ne bavi se sportom', 1, 6);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(7, 0, '30.000 EUR', 1, 7);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(8, 1, 'Marko', 1, 8);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(9, 1, 'Kljajic', 1, 9);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(10, 1, '2402994800100', 1, 10);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(11, 1, '00117280', 1, 11);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(12, 1, 'Rumenacka 15 Novi Sad', 1, 12);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(13, 1, '0647772159', 1, 13);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(15, 2, 'Stefan', 1, 8);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(16, 2, 'Varajic', 1, 9);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(17, 2, '1501389800000', 1, 10);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(18, 2, '00000007', 1, 11);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(19, 2, 'Doze Djerdja 7 Novi Sad', 1, 12);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(20, 2, '0641783647', 1, 13);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(22, 0, 'Stefan', 1, 35);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(23, 0, 'Varajic', 1, 36);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(24, 0,'1501389800000', 1, 37);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(25, 0, '00000007', 1, 38);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(26, 0, 'Doze Djerdja 7 Novi Sad', 1, 39);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(27, 0, '0641783647', 1, 40);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(28, 0, 'stefan.varajic@email.com', 1, 14);

--VREDNOSTI ZA OSIGURANJE POMOCI NA PUTU
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(29, 0, '2017-08-15 00:00:00', 2, 1);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(30, 0, '2017-08-25 00:00:00', 2, 2);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(31, 0, 'Preko 300 km', 2, 23);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(32, 0, 'Nema', 2, 24);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(33, 0, 'Nema', 2, 25);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(34, 0, 'Nema', 2, 26);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(35, 0, 'Mercedes', 2, 27);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(36, 0, 'Putnicko', 2, 28);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(37, 0, '2007', 2, 29);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(38, 0, 'NS315HG', 2, 30);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(39, 0, '16984847', 2, 31);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(40, 0, 'Nikola', 2, 32);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(41, 0,'Sajic', 2, 33);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(42, 0,'2407994780147', 2, 34);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(43, 0,'Nikola', 2, 35);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(44, 0,'Sajic', 2, 36);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(45, 0,'1501389800000', 2, 37);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(46, 0,'00000007', 2, 38);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(47, 0,'DETELINARA 7 Novi Sad', 2, 39);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(48, 0,'0641234567', 2, 40);
insert into vrednostatributaosiguranja(id, kontrolniBroj, vrednost, osiguranje_id, tipAtributa_id) values(49, 0,'nikola.sajic@email.com', 2, 14);