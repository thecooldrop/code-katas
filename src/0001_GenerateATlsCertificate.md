# Generate a self-signed TLS certificate

Goal of this exercise is to generate a self-signed certificate.

# Solution

For generating self-signed certificates we can use `openssl` CLI tool.
In order to generate a self-signed certificate we can use the `openssl req` command
as in:

```bash
openssl req -newkey rsa:2048 -nodes -keyout tls.key -x509 -out tls.crt
```

# Importance of lesson

Often in your career you will be faced with handling of
certificates and how these are generated. In this exercise
you will get your first exposure to how TLS certificates
are created.

Note that openssl CLI tool is used for many other certificate
related tasks beyond simple certificate creation. I recommend
you read up on basics of openssl, but not much as it is a very
broad tool.