# Examen Acceso a Datos Curso 22-23 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita superar todos
los objetivos.

Los objetivos están agrupados en:

1. SharedPreferences (ficheros xml).
2. Base de Datos (Room).
3. Firebase (Realtime).
4. DataStore (ficheros xml + reactividad).
5. Gestión de fuentes de datos: LocalDataSource y RemoteDataSource.

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

- El alumno debe escoger la mejor forma de almacenar la información que se solicite siempre usando
  una modalidad de SharedPreferences.
- La feature con la que se trabajará será con login.
- El usuario y contraseña se meten a mano desde la actividad (hay un ejemplo en MainActivity).
- Al iniciarse, si no existe datos de login, se almacenarán en local.
- Al iniciarse, si existen datos del login, no se almacenan y se visualizan por consola.
- Al pulsar el botón "Eliminar" se elimina los datos del login.
- Esto se podrá ejecutar todas las veces que se quieran y el comportamiento deberá ser el mismo.

## Ejercicio 2: Bases de Datos Room

Se pide desarrollar una aplicación que obtenga un listado de animales desde remoto y se guarde en
una caché
local (Room) para no acceder siempre a remoto. Las premisas a cumplir son:

1. La primera vez que se ejecuta la aplicación, se pedirán los datos a remoto.
2. La segunda vez y posteriores, los datos a devolver serán de local.
3. El listado de animales se visualizará por consola.
4. La caché se hará con Room. **No es una caché TTL, no hace falta añadir tiempo**
5. Si se pulsa el botón: Eliminar datos de Animales, se eliminarán los datos de local.
6. Al volver a iniciar la app, se hará lo indicado en el paso 1.
7. Se pide recuperar un único animal. El animal a recuperar puede ser cualquiera. El código está en
   MainActivity.

## Ejercicio 3: Firebase

Se pide desarrollar una aplicación que recupere un listado de ofertas. La base de datos está creada
y tiene la siguiente estructura:  ![](/assets/img_firebase.png)

