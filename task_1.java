@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Пользователю должно быть 18 или более лет.",true,isAdult);// Напиши код здесь
}
