# Examen Acceso a Datos Curso 22-23 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita superar todos
los objetivos.

Los objetivos están agrupados en:

1. [SharedPreferences](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-sharedpreference.html).
2. [Base de Datos (Room)](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-room.html).
3. [Firebase (Realtime)](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-firebase.html).
4. [DataStore](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-flow.html).
5. [Gestión de fuentes de datos: LocalDataSource y RemoteDataSource](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-data-sources.html).
6. [Calidad del código](https://iesam-dam.github.io/acceso-a-datos/evaluation/ra-commons.html)

Si en la prueba existiera algo que no se haya visto en clase o esté fuera de los objetivos no será
calificado y lo dará el profesor.

## Requisitos para la realización de la prueba

- La prueba tiene una duración de 4 horas. Una vez terminada la prueba, se quitarán los privilegios
  al usuario para evitar modificaciones.
- La prueba se hará sobre el
  repositorio: [Prueba AAD Curso 22/23 Marzo](https://github.com/IESAM-DAM/ex_22_23_aad_marzo.git)
- La prueba se entrega a través de una Pull Request por cada uno de los ejercicios solicitados. Si
  no se entrega una Pull Request se considerará incompleta pues existe un objetivo sobre la
  documentación a través de Pull Request.
- En la Pull Request pondrá como revisor al profesor.
- **No se hará nada de Interfaz de Usuario** todo lo que se pida se deberá mostrar por la
  terminal/consola.
- No hará falta crear casos de uso, el alumno puede trabajar directamente con los repositorios en la
  Activity.
- Todas las llamadas a los repositorios se harán en el MainActivity.

Si se incumple algunos de los requisitos descritos la prueba se considerará como **No entregada**.

## Ejercicio 1: SharedPreferences

Una aplicación tiene un login donde se solicita al usuario para su acceso un **email** y una **
contraseña**. Las premisas a cumplir son:

1. Añadir las librerías que se crean oportunas. (Gson ya está añadida)
2. El alumno debe escoger la mejor forma de almacenar la información que se solicite siempre usando
   una modalidad de SharedPreferences.
3. La feature con la que se trabajará será con login.
4. El usuario y contraseña se meten a mano desde la actividad (hay un ejemplo en MainActivity).
5. Al iniciarse, si no existe datos de login, se almacenarán en local.
6. Al iniciarse, si existen datos del login, no se almacenan y se visualizan por consola.
7. Al pulsar el botón "Eliminar" se elimina los datos del login.
8. Esto se podrá ejecutar todas las veces que se quieran y el comportamiento deberá ser el mismo.
9. En la PR adjuntar captura del fichero XML.

## Ejercicio 2: Bases de Datos Room

Se pide desarrollar una aplicación que obtenga un listado de animales desde remoto y se guarde en
una caché local (Room) para no acceder siempre a remoto. Las premisas a cumplir son:

1. Añadir las dependencias necesarias para trabajar con Room.
2. La primera vez que se ejecuta la aplicación, se pedirán los datos a remoto.
3. La segunda vez y posteriores, los datos a devolver serán de local.
4. El listado de animales se visualizará por consola.
5. La caché se hará con Room. **No es una caché TTL, no hace falta añadir tiempo**
6. Si se pulsa el botón: Eliminar datos de Animales, se eliminarán los datos de local.
7. Al volver a iniciar la app, se hará lo indicado en el paso 1.
8. Se pide recuperar un único animal. El animal a recuperar puede ser cualquiera. El código está en
   MainActivity.
9. Añadir captura de la base de datos obtenida a través del IDE.

**IMPORTANTE**
Leer la descripción del ejercicio 5 pues están relacionados.

## Ejercicio 3: Firebase

Se pide desarrollar una aplicación que recupere un listado de ofertas. La base de datos está creada
con Realtime
y tiene la siguiente estructura:  ![](/assets/img_firebase.png). Las premisas a cumplir son:

1. Añadir las dependencias necesarias para trabajar con RealtimeDatabase.
2. Al ejecutarse la aplicación obtendrá el listado de ofertas desde firebase.
3. Se deberán mostrar los datos en la terminal.
4. **No hay que guardar nada en local**. Siempre se obtendrán los datos desde remoto.

## Ejercicio 4: DataStore con Flow

Se pide desarrollar una aplicación que defina un fichero DataStore que permita guardar y recuperar
un listado de establecimientos. Las premisas a cumplir son:

1. Añadir la librería para trabajar con DataStore en su modalidad "preferences" (la vista en clase).
2. Se trabajará con la feature: establishments
3. Crear la clase que permita guardar y recuperar un objeto Establishment (
   EstablishmentLocalDataSource).
4. Cuando se pulse el botón **Leer Establecimiento** se recuperará el objeto establishment y se
   mostrará
   por terminal.

## Ejercicio  5: Gestión de los DataSource

Este ejercicio se valorará en la resolución que se haga en el **Ejercicio 2 (Room)**.


