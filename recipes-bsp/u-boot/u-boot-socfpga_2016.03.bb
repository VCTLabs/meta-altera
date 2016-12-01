require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

# This revision is the v2016.03 release
SRCREV = "df61a74e6845ec9bdcdd48d2aff5e9c2c6debeaa"

SRC_URI_append_cyclone5 = " \
        file://0001-socfpga_de0_nano_soc.h-add-boot.scr-support.patch \
        file://0002-de0_nano_soc_defconfig-updated-config-for-spi.patch \
        file://boot.txt \
"

UBOOT_ENV = "boot"
UBOOT_ENV_SUFFIX = "scr"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PV = "2016.03"
PV_append = "+git${SRCPV}"

do_compile_append() {
        mkimage -A ${TARGET_ARCH} -O linux -T script -C none -n ${UBOOT_ENV_BINARY} \
             -d ${WORKDIR}/${UBOOT_ENV}.txt ${WORKDIR}/${UBOOT_ENV_BINARY}
}

DEPENDS += "dtc-native"

addtask deploy before do_build after do_install
