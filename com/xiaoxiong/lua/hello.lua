tab1 = {"val1",[1]="val2",key3="vual3"}

for k,v in pairs(tab1) do
    --print(k .. "-" .. v)
    print(k , v)
end

print("---------------")


for k,v in ipairs(tab1) do
    print(k , v)
end



--[[输出结果

1       val1
key3    vual3
---------------
1       val1


--]]


