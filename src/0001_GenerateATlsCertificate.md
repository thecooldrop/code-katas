# Generate a self-signed TLS certificate

Goal of this exercise is to generate a self-signed certificate.

# Solution

For generating self-signed certificates we can use `openssl` CLI tool.
In order to generate a self-signed certificate we can use the `openssl req` command
as in:

```bash
openssl req -newkey rsa:2048 -nodes -keyout tls.key -x509 -out tls.crt
```