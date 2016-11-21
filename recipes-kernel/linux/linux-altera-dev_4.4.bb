FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

COMPATIBLE_MACHINE_cyclone5 = "cyclone5"
SRC_URI_append_cyclone5 = " file://defconfig "

LINUX_VERSION = "4.4"

include linux-altera.inc
