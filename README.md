# TallerEXDEUsuario

<!-- local-development:start -->
## Desarrollo local

Consulta [RUNNING.md](RUNNING.md) para ubicar cada componente, abrirlo en su IDE, compilarlo y conocer las comprobaciones realizadas y los requisitos pendientes.
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
