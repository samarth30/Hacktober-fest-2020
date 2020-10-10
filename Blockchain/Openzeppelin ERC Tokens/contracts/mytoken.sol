// SPDX-License-Identifier: MIT
pragma solidity >=0.6.0;

// import "../node_modules/openzeppelin-solidity/contracts/token/ERC721/ERC721.sol";
// import "../node_modules/openzeppelin-solidity/contracts/token/ERC721/IERC721.sol";
// import "../node_modules/openzeppelin-solidity/contracts/token/ERC721/IERC721Enumerable.sol";

// All the above can be called using ERC721Full.sol module provided by open zeppelin

import "../node_modules/openzeppelin-solidity/contracts/token/ERC721/ERC721.sol";

import "../node_modules/openzeppelin-solidity/contracts/token/ERC721/ERC721Burnable.sol";

contract MyContract is ERC721, ERC721Burnable {
    constructor() public {}

 }
