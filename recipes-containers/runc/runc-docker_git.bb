include runc.inc

# Note: this rev is before the required protocol field, update when all components
#       have been updated to match.
SRCREV_runc-docker = "ca73c9fd4b684a7ddec8b3bd892b5f76d6f21710"
SRC_URI = "git://github.com/opencontainers/runc;branch=release-1.1;name=runc-docker;protocol=https \
           file://0001-runc-Add-console-socket-dev-null.patch \
           file://0001-Makefile-respect-GOBUILDFLAGS-for-runc-and-remove-re.patch \
           file://0001-runc-docker-SIGUSR1-daemonize.patch \
          "

RUNC_VERSION = "1.1.7"

CVE_PRODUCT = "runc"
