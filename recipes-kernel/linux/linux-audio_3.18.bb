# this recipe does not look in config/*

include linux-altera.inc

COMPATIBLE_MACHINE_cyclone5 = "cyclone5"

SRC_URI_append_cyclone5 = " \
	file://0001-wm8731.c-Add-support-for-32-bit-word-length.patch \
        file://0002-ARM-socfpga_cyclone5_de1_soc.dts-add-new-file-for-te.patch \
        file://defconfig \
"

SRCREV = "034e7cbef5db4a259e9658939e16c53909fc1f34"

LINUX_VERSION = "3.18"
