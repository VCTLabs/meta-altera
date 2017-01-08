FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

include linux-altera.inc

COMPATIBLE_MACHINE_cyclone5 = "cyclone5"

SRC_URI_append_cyclone5 = " \
        file://0001-dts-socfpga_cyclone5_de1_soc-add-2-new-de1_soc-files.patch \
        file://0002-DE1-has-LTC-connector-wired-up-to-SPI1-pins-not-SPI0.patch \
        file://wm8731-add-support-for-32-bit-word-length.patch \
        file://defconfig \
"

SRCREV = "969478b841e58aeec90fa79eb3fbd4d2a11fd57f"

LINUX_VERSION = "4.4"
