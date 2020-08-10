- url endpoints
http://localhost:8080/fem/api/etab/v1/test

- console admin 
http://localhost:8080/_ah/admin/

    install : 
    - DataStore Local = gcloud beta emulators datastore env-init > set_vars.cmd && set_vars.cmd
 gcloud auth login
gcloud beta auth application-default login

start emulateur :gcloud beta emulators datastore start

Datastore : http://localhost:8081    