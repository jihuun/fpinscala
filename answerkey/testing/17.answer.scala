val forkProp = Prop.forAllPar(gpy2)(y => equal(Par.fork(y), y))