class Controller
{
    private View view;
    public Controller(View view)
    {
        this.view = view;
    }

    public string[]? Create()
    {
        string[] temp;
        string[] allParametrs = {"surname", "name", "patronymic", "birthday", "phone", "gender"};
        Dictionary<string, string>? dict = null;
        try
        {
            temp = view.Input();
            dict = Parse(temp);
            if (dict.Count < 6)
                throw new ParametrException(dict);
                
        }
        catch (IOException)
        {
            System.Console.WriteLine("Введено больше или меньше данных, чем требуется");

            return null;
        }
        catch (ParametrException e)
        {
            string errorLog = "Параметры не обнаружены:\n";
            string[] keys = e.Dict.Keys.ToArray();

            foreach (string param in allParametrs)
            {
                if (!keys.Contains(param))
                    errorLog += $"{param}\n";
            }
            System.Console.Write(errorLog);

            return null;
        }
        string[] outArray = new string[]{dict["surname"], dict["name"],
                                    dict["patronymic"], dict["birthday"],
                                    dict["phone"], dict["gender"]};
        return outArray;
    }
    private static Dictionary<string,string> Parse(string[] parametrs)
    {
        Dictionary<string, string> dict = new();
        int nameIndex = 1;
        foreach (string param in parametrs)
        {
            if (param.Length == 1)
            {
                string temp = param.ToLower();
                if (param.ToLower() == "f" || param.ToLower() == "m")
                    dict.Add("gender", temp);
                continue;
            }

            if (DateOnly.TryParse(param, out _))
            {
                dict.Add("birthday", param);
                continue;
            }

            if (param.Length == 11 && long.TryParse(param, out _))
            {
                dict.Add("phone", param);
                continue;
            }
            if (param.Any(c => char.IsLetter(c)))
                switch (nameIndex)
                {
                    case 1:
                        dict.Add("surname", param);
                        break;
                    case 2:
                        dict.Add("name", param);
                        break;
                    case 3: 
                        dict.Add("patronymic", param);
                        break;
                }
            nameIndex++;
        }

        return dict;
    }
}