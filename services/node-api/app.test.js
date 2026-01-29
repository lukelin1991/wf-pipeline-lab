const request = require("supertest");
const app = require("./app");

describe("GET /hello", () => {
  it("returns hello message", async () => {
    const res = await request(app).get("/hello");
    expect(res.statusCode).toBe(200);
    expect(res.body.message).toBe("hello from node-api");
  });
});
