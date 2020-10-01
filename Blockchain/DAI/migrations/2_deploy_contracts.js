const Dai = artifacts.require("Dai");

module.exports = function(deployer) {
  deployer.deploy(Dai);
};
