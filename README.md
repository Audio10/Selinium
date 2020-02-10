# Selenium

## 1.- Directivas básicas.

### Configurar driver.

```java
System.setProperty("webdriver.chrome.driver", "URL\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
```

### Configurar endpoint.

```
driver.get("https://google.com");
```

### Obtener el titulo de la pagina.

```
System.out.println(driver.getTitle());
```

### Checar la url donde estas actualmente.

```
System.out.println(driver.getCurrentUrl());
```

### Obtener el source de la pagina.

```
System.out.println(driver.
());
```

### Navegar atras y adelante.

```
driver.navigate().back();
driver.navigate().forward();
```

### Formas de cerrar

```
// Close cierra la pagina actual.
driver.close();

//Quit cierra todas las paginas abiertas por selenium.
driver.quit();


```

### Seleccionar elementos.

#### Seleccionar por nombre.

- Se seleccionas elementos con los métodos **find**.
- Y se envía la data mediante **sendKeys**.

```
driver.findElementById("email").sendKeys("claudiojesus_10@hotmail.com");
```

#### Seleccionar por texto.

- Se seleccionan las `a` mediante **findElementByLinkTest**
- Se aplica el evento **click()** para clickear el enlace.

```
driver.findElementByLinkText("¿Has olvidado los datos de la cuenta?").click();

```

