package aula_100_TrabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
//import java.util.TimeZone;

public class ProgramaData {

	public static void main(String[] args) throws ParseException {
		/*SimpleDateFormat simpleDF = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		SimpleDateFormat simpleDF2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		simpleDF2.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date agora = new Date();
		
		Date niverDela = simpleDF.parse("18-07-2020");
		Date nascimentoDela = simpleDF.parse("18-07-1993");
		Date niverMeu = simpleDF.parse("10-09-2020");
		Date nascimentoMeu = simpleDF1.parse("10-09-1987 06:00:00");
		
		System.out.println("Agora: "+simpleDF1.format(agora));
		System.out.println("Próximo aniversário dela: "+simpleDF.format(niverDela));
		System.out.println("Data de nascimento: "+simpleDF.format(nascimentoDela));
		System.out.println("Meu próximo aniversário: "+simpleDF.format(niverMeu));
		System.out.println("Nasci em: "+simpleDF1.format(nascimentoMeu));
		System.out.println("Correspondendo em GMT: "+simpleDF2.format(nascimentoMeu));
		
		System.out.println();
		System.out.println("---------------------");
		
		Date d = Date.from(Instant.parse("2018-06-25T17:05:10Z"));
		System.out.println(simpleDF1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 12);
		d = cal.getTime();
		System.out.println(simpleDF1.format(d));
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date herBirth = Date.from(Instant.parse("1993-07-18T06:30:20Z"));
		
		System.out.println(sdf.format(herBirth));
		
		Calendar calen = Calendar.getInstance();
		calen.setTime(herBirth);
		calen.add(Calendar.HOUR_OF_DAY, 6);
		herBirth = calen.getTime();
		//System.out.println(sdf.format(herBirth));
		int dia = calen.get(Calendar.DATE);
		System.out.println("Dia: "+dia);
		int mes = 1+ calen.get(Calendar.MONTH);
		System.out.println("Mês: "+mes);
		int ano = calen.get(Calendar.YEAR);
		System.out.println("Ano: "+ano);
		int horas = calen.get(Calendar.HOUR);
		System.out.println("Horas: "+horas);
		int minutos = calen.get(Calendar.MINUTE);
		System.out.println("Minutos: "+minutos);
		int segundos = calen.get(Calendar.SECOND);
		System.out.println("Segundos: "+segundos);
		
		
	}
}
