FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

include linux-altera.inc

COMPATIBLE_MACHINE_cyclone5 = "cyclone5"

SRC_URI_append_cyclone5 = " \
        file://0001-ARM-dts-socfpga_cyclone5_de1_soc.dts-add-initial-fil.patch \
        file://defconfig \
"

SRCREV = "969478b841e58aeec90fa79eb3fbd4d2a11fd57f"

LINUX_VERSION = "4.4"
