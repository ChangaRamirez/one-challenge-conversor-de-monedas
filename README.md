
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![project_license][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto">
    <img src="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/blob/main/assets/images/amigo-secreto-logo.JPG" alt="Logo" width="300" height="120">
  </a>

<h3 align="center">Conversor de Monedas</h3>

  <p align="center">
    Conversor de divisas con conexión a una API de tasas de cambio en tiempo real.
    Permite convertir montos entre distintas monedas utilizando datos actualizados al momento.
    <br />
    <a href="https://github.com/ChangaRamirez/one-challenge-conversor-de-monedas"><strong>Explora los documentos »</strong></a>
    <br />
    <br />
    <a href="https://github.com/ChangaRamirez/one-challenge-conversor-de-monedas">Ver Demo</a>
    &middot;
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues/new?labels=bug&template=bug-report.md">Reportar Un Bug</a>
    &middot;
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues/new?labels=enhancement&template=feature-request.md">Solicitar Una Funcionalidad</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenidos</summary>
  <ol>
    <li>
      <a href="#about-the-project">Acerca Del Proyecto</a>
      <ul>
        <li><a href="#built-with">Creado Con</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Empezando</a>
      <ul>
        <li><a href="#prerequisites">Prerequisitos</a></li>
        <li><a href="#installation">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#usage">Uso</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contribuyendo</a></li>
    <li><a href="#license">Licencia</a></li>
    <li><a href="#contact">Contacto</a></li>
    <li><a href="#acknowledgments">Reconocimientos</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Acerca Del Proyecto

<img src="assets/images/amigo-secreto.png" alt="Logo" width="500">

<!--Here's a blank template to get started. To avoid retyping too much info, do a search and replace with your text editor for the following: `ChangaRamirez`, `one-challenge-amigo-secreto`, `twitter_handle`, `linkedin_username`, `hotmail`, `laloraco`, `project_title`, `project_description`, `project_license`-->

### ¡Conversor de Divisas al Rescate!

¿Te has encontrado alguna vez haciendo matemáticas mentales para saber cuántos reales brasileños son 50 pesos mexicanos? ¿O intentando recordar si el peso colombiano está más caro que el argentino?
Pues ya no más. Este proyecto es tu nuevo aliado financiero: un conversor de divisas hecho en Java, con conexión en tiempo real a una API de tasas de cambio.

Este programa nació con el objetivo de practicar el uso de HttpClient, manejar datos externos desde una API, y de paso, hacer algo útil (¡porque convertir monedas manualmente está sobrevalorado!).

Con una interfaz sencilla desde consola, solo introduces la moneda origen, la moneda destino y el monto... y bam, obtienes el resultado al instante, usando tasas de cambio fresquecitas traídas desde internet.

Además, el proyecto corre directamente desde IntelliJ IDEA, así que si eres fan del autocompletado, los atajos de teclado y las pestañas por todas partes, te sentirás como en casa. 👀

![A Cool Gif](https://media.tenor.com/5Z-o3OKSPFIAAAAM/adult-swim-monkey.gif)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



### Creado con

* [![Java][Java]][Java-url]
<!--* [![Next][Next.js]][Next-url]
* [![React][React.js]][React-url]
* [![Vue][Vue.js]][Vue-url]
* [![Angular][Angular.io]][Angular-url]
* [![Svelte][Svelte.dev]][Svelte-url]
* [![Laravel][Laravel.com]][Laravel-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]
* [![JQuery][JQuery.com]][JQuery-url]-->

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>

<!-- GETTING STARTED -->
## Empezando

Aquí van las instrucciones para poder visualizar el proyecto, ya sea desde un navegador web o si se desea, localmente desde tu computadora.
Para conseguir una copia local solo hay que seguir unos sencillos pasos.

### Prerequisitos

Realmente al ser un proyecto sencillo solo se requiere de un navegador web (yo utilicé Chrome v. 132.0.6834.160) y un editor de codigo para poder examinar los documentos. Pero basta con revisar el repositorio directamente desde [GitHub](https://github.com/ChangaRamirez/one-challenge-amigo-secreto) para explorar los documentos desde ahí =)

### Instalación

1. Clonar el repositorio
   ```sh
   git clone https://github.com/ChangaRamirez/one-challenge-conversor-de-monedas.git
   ```
5. Cambiar el git remote url para evitar pushes accidentales al proyecto base
   ```sh
   git remote set-url origin ChangaRamirez/one-challenge-conversor-de-monedas
   git remote -v # confirmar los cambios
   ```
<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- USAGE EXAMPLES -->
## Uso

<div align=center><img src="assets/gifs/demo.gif" alt="Logo" width="500"></div>

 Este proyecto puede ser tu nuevo compañero para cuando necesites saber cuánto vale realmente tu dinero en otra parte del mundo. Ya sea que estés planeando un viaje, comprando algo online o simplemente por pura curiosidad financiera, este conversor tiene lo que necesitas.

Aquí te muestro algunas formas de sacarle el máximo provecho a esta herramienta:

### Convertir entre monedas al instante
¿Quieres saber cuántos reales brasileños puedes conseguir por 100 pesos colombianos? Solo necesitas introducir la opción adecuada y el monto. El sistema se conectará automáticamente a una API de tasas de cambio actualizadas y te mostrará el valor en segundos. ¡Ideal para viajeros, estudiantes de economía o curiosos en general!

### Consultar tasas actualizadas en tiempo real
Olvídate de buscar en páginas confusas o ver tasas desactualizadas. Este programa se conecta a una API externa que ofrece datos frescos directamente desde internet. Puedes confiar en que estás viendo una tasa válida al momento de usarla.

### Practicar Java de forma útil
Este proyecto no es solo práctico: también está pensado para quienes están aprendiendo. Aquí se demuestra cómo utilizar HttpClient para hacer peticiones a APIs, manejar datos externos, y estructurar un programa en Java con buenas prácticas. Es una base sólida para cualquier desarrollador en crecimiento.

## Funciones adicionales para mejorar la experiencia del usuario:
Aunque esta aplicación es de consola, se ha diseñado con atención al detalle para asegurar que la experiencia sea fluida y clara, incluso sin una interfaz gráfica.

### Validación de entradas
Si el usuario introduce una opcion no válida (como "11" o "abc" en vez de "1"), el programa lo detecta y le indica introducir una opción correcta. ¡Nada de errores confusos ni bloqueos! ✨

<img src="assets/gifs/eliminacion-no-alfabeticos.gif" alt="Logo" width="400">

### Formato limpio de resultados
Los resultados son presentados con precisión, mostrando claramente el monto convertido, las monedas involucradas y la tasa utilizada. Siempre sabrás cómo se obtuvo el resultado. 🧹

<img src="assets/gifs/capitalizacion-automatica.gif" alt="Logo" width="400">

### Preparado para futuras mejoras
Este proyecto fue estructurado pensando en el crecimiento. Ya sea que quieras agregar una interfaz gráfica, más monedas, o funcionalidades como conversión histórica, ¡estás listo para seguir construyendo! 🔤

<img src="assets/gifs/capitalizacion-guion.gif" alt="Logo" width="400">

¡Y eso es todo! Ya estás listo para usar este conversor y nunca más quedarte con la duda de cuánto valen tus billetes fuera del país. 💸
¡Espero que lo disfrutes tanto como yo al hacerlo!

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- ROADMAP -->
## Roadmap

Este conversor de divisas se desarrolló paso a paso, con un enfoque en integrar datos en tiempo real, manejar respuestas JSON y ofrecer una experiencia clara desde consola. A continuación, se detallan las etapas clave del desarrollo:

### ✅ 1. Conociendo la API para traer datos - ExchangeRate-API
El proyecto comenzó investigando y entendiendo cómo funciona la API que proporciona tasas de cambio actualizadas, asegurando que fuera confiable, rápida y fácil de integrar.

### ✅ 2. Importando la biblioteca Gson en IntelliJ
Para poder interpretar las respuestas JSON de la API, se integró la biblioteca Gson, que permite mapear datos JSON a objetos de Java de manera sencilla y eficaz.

### ✅ 3. Construyendo el Cliente para Solicitudes (HttpClient)
Se configuró y creó el `HttpClient` de Java para establecer una conexión HTTP moderna y segura con la API de divisas.

### ✅ 4. Construyendo la Solicitud (HttpRequest)
Se implementó la lógica que genera la solicitud HTTP con los parámetros necesarios (como la moneda base), listos para enviarse a la API.

### ✅ 5. Construyendo la Respuesta (HttpResponse)
Una vez enviada la solicitud, se configuró el manejo de la respuesta HTTP, capturando los datos crudos provenientes de la API.

### ✅ 6. Analizando la respuesta en formato JSON
Con la ayuda de Gson, se transformó la respuesta JSON en objetos Java útiles para el sistema, facilitando su análisis y posterior uso.

### ✅ 7. Filtrando las monedas
Se implementaron mecanismos para validar y filtrar las monedas ingresadas por el usuario, asegurando que solo se acepten códigos válidos y reconocidos por la API.

### ✅  8. Convirtiendo los valores
El núcleo del proyecto: una función que toma la tasa de cambio y el monto ingresado por el usuario, y devuelve el valor convertido de manera precisa.

### ✅ 9. Interactuando con el usuario
Se diseñó una interacción fluida mediante consola, solicitando inputs al usuario y mostrando resultados claros y bien formateados.
Una función que filtra y elimina cualquier carácter no alfabético del input del usuario, asegurando que solo se almacenen nombres válidos sin números, símbolos u otros caracteres no deseados.

### 📌 10. Historial de Conversiones con Marca de Tiempo
Como valor agregado, se implementó un registro simple de las conversiones realizadas, cada una con su respectiva fecha y hora, permitiendo llevar un historial útil.
Este roadmap resume el progreso del proyecto hasta ahora, pero aún queda espacio para nuevas funciones como selección desde una lista de monedas, interfaz gráfica o incluso comparativas entre múltiples divisas.
🚀 ¡Esto apenas comienza!

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- CONTRIBUTING -->
## Contribuyendo

Las contribuciones son lo que hace que la comunidad de código abierto sea un lugar tan increíble para aprender, inspirar y crear. Cualquier contribución que hagas será **muy apreciada**.

Si tienes una sugerencia que pueda mejorar esto, por favor haz un fork del repositorio y crea un pull request. También puedes abrir un issue con la etiqueta "enhancement" (mejora). ¡No olvides darle una estrella al proyecto! ¡Gracias nuevamente!

1. Haz un fork del proyecto
2. Crea tu rama de características (git checkout -b feature/AmazingFeature)
3. Haz commit de tus cambios (git commit -m 'Añadir una AmazingFeature')
4. Sube a la rama (git push origin feature/AmazingFeature)
5. Abre un pull request

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>

### Top contribuyentes:

<a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=ChangaRamirez/one-challenge-amigo-secreto" alt="contrib.rocks image" />
</a>



<!-- LICENSE -->
## Licencia

Este proyecto es para uso personal y educativo exclusivamente. El uso comercial no está autorizado. Puedes leer más en [LICENCE.txt](LICENCE.txt)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- CONTACT -->
## Contacto

Eduardo "Changa" Ramírez-García - laloraco@hotmail.com

Link del Proyecto: [https://github.com/ChangaRamirez/one-challenge-conversor-de-monedas](https://github.com/ChangaRamirez/one-challenge-conversor-de-monedas)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Reconocimientos

* [Alura LATAM](https://www.aluracursos.com/)
* [ONE - Oracle Next Education](https://www.oracle.com/mx/education/oracle-next-education/)
* [Othneil Drew (tu plantilla README.md me salvó)](https://github.com/othneildrew)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[contributors-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[forks-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/network/members
[stars-shield]: https://img.shields.io/github/stars/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[stars-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/stargazers
[issues-shield]: https://img.shields.io/github/issues/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[issues-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues
[license-shield]: https://img.shields.io/github/license/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[license-url]: https://raw.githubusercontent.com/ChangaRamirez/one-challenge-amigo-secreto/refs/heads/main/LICENCE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ramirezpaints/
[product-screenshot]: images/screenshot.png
[JavaScript]: https://shields.io/badge/JavaScript-F7DF1E?logo=JavaScript&logoColor=000&style=flat-square
[JavaScript-url]: https://www.javascript.com/
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/es/
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
