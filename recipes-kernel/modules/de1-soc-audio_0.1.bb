SUMMARY = "Reference audio drivers for DE1 SoC, OpenCores I2S and WM8731"
AUTHOR = "Stephen Arnold <stephen.arnold42@gmail.com>"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/VCTLabs/DE1-SoC-Sound.git \
          "
SRCREV = "4add56a79cbbe87863cf41848a99699964cecf83"

S = "${WORKDIR}/git/drivers"

