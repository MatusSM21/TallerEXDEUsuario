

<!-- local-development:start -->
# Desarrollo local

Puedes abrir este repositorio en VS Code, Antigravity o Sublime Text. El compilador y los servicios necesarios dependen del componente indicado abajo.

## Maven

Abre el `pom.xml` correspondiente en NetBeans. Usa `mvn test` en su carpeta después de revisar plugins y perfiles. Las compilaciones Java/Ant de la tabla no cubren los componentes Maven.

## Componentes y validación

Inventario y compilaciones locales del 2026-11-15. Una compilación correcta no acredita todavía interacción, compatibilidad de base de datos, instalador ni despliegue.

| Componente | Tipo / destino | Validación |
| --- | --- | --- |
| [TallerEXDEUsuario/pom.xml](<TallerEXDEUsuario/pom.xml>) | maven | Compila; comprobado el 2026-11-15; ver alcance actualizado abajo |

## Archivos ignorados

`.gitignore` excluye credenciales locales, estado del editor y salidas de las herramientas detectadas. No deja de versionar archivos que ya estaban en Git. Los manifiestos, archivos de bloqueo, recursos fuente y scripts de esquema forman parte del código.
<!-- local-development:end -->

<!-- build-repairs-20261115:start -->
## Reparación y comprobación — 2026-11-15

- Se documentaron los comandos de compilación y comprobación con Maven/JDK 24 y se conservaron los cambios previos de README y exclusiones.

Comprobado:

- Maven package terminó correctamente para `TallerEXDEUsuario/pom.xml`.

Comandos:

```powershell
mvn -f "TallerEXDEUsuario/pom.xml" package
```

Alcance pendiente:

- Compilar y ejecutar la suite disponible no demuestra todos los flujos gráficos, de datos o de instalación.

<!-- build-repairs-20261115:end -->
