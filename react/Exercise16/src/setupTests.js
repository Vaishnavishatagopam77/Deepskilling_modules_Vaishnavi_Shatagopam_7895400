const { TextDecoder, TextEncoder } = require("util");

global.TextDecoder = TextDecoder;
global.TextEncoder = TextEncoder;

const Enzyme = require("enzyme");
const Adapter = require("enzyme-adapter-react-16");

Enzyme.configure({
  adapter: new Adapter()
});