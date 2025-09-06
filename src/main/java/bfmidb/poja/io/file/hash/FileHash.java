package bfmidb.poja.io.file.hash;

import bfmidb.poja.io.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
