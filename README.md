# sbt_doobie
Show compilation error when declaring `org.tpolecat.doobie` as "provided"

Compiling module `server` with `sbt server/compile` will produce an error like this:
```
[error] C:\Users\(...)\server\src\main\scala\main.scala:1:17: Symbol 'term <root>.doobie' is missing from the classpath.
[error] This symbol is required by 'method Repo.test'.
[error] Make sure that term doobie is in your classpath and check for conflicting dependencies with `-Ylog-classpath`.
[error] A full rebuild may help if 'Repo.class' was compiled against an incompatible version of <root>.
[error] trait A extends Repo
[error]                 ^
[error] one error found
[error] (server / Compile / compileIncremental) Compilation failed
```
